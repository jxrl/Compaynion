package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.app.Activity;
import android.util.Log;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;
import org.json.JSONObject;

public class StudentRecharge extends AppCompatActivity implements PaymentResultListener {

    private Button sBack4;
    private EditText amountEdt;
    private Button button;
    int amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_recharge);

        sBack4 = (Button) findViewById(R.id.backWallet3);
        // initializing all our variables.
        button = findViewById(R.id.idBtnPay);
        amountEdt = findViewById(R.id.idEdtAmount);

        //intent to open go back to student wallet
        sBack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(StudentRecharge.this,StudentWallet.class);
                startActivity(i1);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPayment();


                // on below line we are getting
                // amount that is entered by user.
                String samount = amountEdt.getText().toString();

                // rounding off the amount.
                amount = Math.round(Float.parseFloat(samount) * 100);


                Checkout.preload(getApplicationContext());

            }
        });
    }

    private void startPayment(){

        // Instantiate Checkout

        Checkout checkout = new Checkout();
        checkout.setKeyID("rzp_test_eNwgA5oEnElHde");

        // Set your logo here

       // checkout.setImage(R.drawable.compaynion1);


        // Reference to current activity

        final Activity activity = this;

        //Pass your payment options to the Razorpay Checkout as a JSONObject

        try {
            JSONObject options = new JSONObject();

            options.put("name", "Compaynion");
            options.put("description", "Reference No. #123456");
            options.put("image", "https://s3.amazonaws.com/rzp-mobile/images/rzp.png");
//            options.put("order_id", "order_DBJOWzybf0sJbb");//from response of step 3.
            options.put("theme.color", "#3399cc");
            options.put("currency", "INR");
            options.put("amount", amount);//pass amount in currency subunits
            options.put("prefill.email", "gaurav.kumar@example.com");
            options.put("prefill.contact","9988776655");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            options.put("retry", retryObj);

            checkout.open(activity, options);

        } catch(Exception e) {
            Log.e("TAG", "Error in starting Razorpay Checkout", e);
        }
    }

    @Override
    public void onPaymentSuccess(String s) {
        Log.d("ONSUCCESS", "onPaymentSuccess: " + s);
    }

    @Override
    public void onPaymentError(int i, String s) {
        Log.d("ONERROR", "onPaymentError: "+s);
    }
}