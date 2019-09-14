package com.aptechprojectsem3.currencyconverter;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import es.dmoral.toasty.Toasty;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    private ArrayList<CountryItem> mainCountryList;
    private TextView  dollarTV, euroTV, poundTV;
    int itemPositionInt;
    private ConstraintLayout constraintLayout;



    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Raleway-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
        setContentView(R.layout.activity_main);


        Button mainButton = findViewById(R.id.buttonconvert);
        Spinner countrySpinner  = findViewById(R.id.spinnerview);
        dollarTV = findViewById(R.id.dollarTextView);
        euroTV = findViewById(R.id.euroTextView);
        poundTV =  findViewById(R.id.poundTextView);
        constraintLayout = findViewById(R.id.constraintlayout);

         //Method that aggregate the country
        // names and their Images
        generateList();

       CountryAdapter adapter = new CountryAdapter(this, mainCountryList);
       countrySpinner.setAdapter(adapter);




        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               // CountryItem clickedItem = (CountryItem) adapterView.getItemAtPosition(i);

                itemPositionInt = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        dollarTV.setText("\u0024 0.00" );
        euroTV.setText("\u20AC 0.00");
        poundTV.setText("\u00A3 0.00");




        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {

                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(constraintLayout.getWindowToken(), 0);

                    EditText editText = findViewById(R.id.et_amount);

                    String mAmountConverted = editText.getText().toString();

                    double mAmountDouble = Double.parseDouble(mAmountConverted);

                    double mAmountInDollars;
                    double mAmountInPounds;
                    double mAmountInEuros;





                    switch (itemPositionInt) {

                        case 0:

                            //Conversion rate for Nigerian Naira to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.0028;
                            mAmountInPounds = mAmountDouble *  0.0022;
                            mAmountInEuros = mAmountDouble * 0.0025;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 1:

                            //Conversion rate for Indian Rupee to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.015;
                            mAmountInPounds = mAmountDouble *  0.012;
                            mAmountInEuros = mAmountDouble * 0.013;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 2:

                            //Conversion rate for Kenyan Shilling to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.0097;
                            mAmountInPounds = mAmountDouble *  0.0077;
                            mAmountInEuros = mAmountDouble * 0.0086;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 3:

                            //Conversion rate for Yemen Rial to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.0040;
                            mAmountInPounds = mAmountDouble *  0.0032;
                            mAmountInEuros = mAmountDouble * 0.0035;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;
                        case 4:

                            //Conversion rate for Iceland Krona to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.0080;
                            mAmountInPounds = mAmountDouble * 0.0063;
                            mAmountInEuros = mAmountDouble * 0.0071;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 5:

                            //Conversion rate for South African Rand to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.071;
                            mAmountInPounds = mAmountDouble *  0.057;
                            mAmountInEuros = mAmountDouble * 0.063;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 6:

                            //Conversion rate for Japanese Yen to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.0093;
                            mAmountInPounds = mAmountDouble *  0.0074;
                            mAmountInEuros = mAmountDouble * 0.0082;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 7:

                            //Conversion rate for Ghanaian Cidi to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.018;
                            mAmountInPounds = mAmountDouble *  0.015;
                            mAmountInEuros = mAmountDouble * 0.016;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 8:

                            //Conversion rate for Canadian Dollars to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.77;
                            mAmountInPounds = mAmountDouble *  0.61;
                            mAmountInEuros = mAmountDouble * 0.68;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 9:

                            //Conversion rate for United Arab Emirates to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.24;
                            mAmountInPounds = mAmountDouble *  0.22;
                            mAmountInEuros = mAmountDouble * 0.24;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 10:

                            //Conversion rate for Swiss Frac to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 1.02;
                            mAmountInPounds = mAmountDouble *  0.81;
                            mAmountInEuros = mAmountDouble * 0.90;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 11:

                            //Conversion rate for Singapore Dollar to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.74;
                            mAmountInPounds = mAmountDouble *  0.59;
                            mAmountInEuros = mAmountDouble * 0.65;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 12:

                            //Conversion rate for Indonesian Rupiah to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.000071;
                            mAmountInPounds = mAmountDouble *  0.000056;
                            mAmountInEuros = mAmountDouble * 0.000063;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 13:

                            //Conversion rate for Danish Krone to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.15;
                            mAmountInPounds = mAmountDouble *  0.12;
                            mAmountInEuros = mAmountDouble * 0.13;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                        case 14:

                            //Conversion rate for Danish Krone to Dollars, Euro and Pounds

                            mAmountInDollars = mAmountDouble * 0.020;
                            mAmountInPounds = mAmountDouble *  0.016;
                            mAmountInEuros = mAmountDouble * 0.016;

                            dollarTV.setText("\u0024" + String.format( "%.2f", mAmountInDollars));
                            euroTV.setText("\u20AC"+ String.format( "%.2f", mAmountInEuros));
                            poundTV.setText("\u00A3" + String.format( "%.2f", mAmountInPounds));

                            break;

                    }

                }catch (Exception e){

                    e.printStackTrace();

                    Toasty.error(getApplicationContext(), "PROVIDE A VALID INPUT", Toast.LENGTH_SHORT, true).show();

                    dollarTV.setText("\u0024 0.00" );
                    euroTV.setText("\u20AC 0.00");
                    poundTV.setText("\u00A3 0.00");
                }

            }

        });
    }

    public void generateList(){
        mainCountryList = new ArrayList<>();
        mainCountryList.add(new CountryItem("Nigerian Naira", R.drawable.nigeriaflag));
        mainCountryList.add(new CountryItem("Indian Rupee", R.drawable.indianflag));
        mainCountryList.add(new CountryItem("Kenyan Shilling", R.drawable.kenyaflag));
        mainCountryList.add(new CountryItem("Yemen Rial", R.drawable.yemenflag));
        mainCountryList.add(new CountryItem("Iceland Krona", R.drawable.icelandflag));
        mainCountryList.add(new CountryItem("SA Rand", R.drawable.southafricaflag));
        mainCountryList.add(new CountryItem("Japanese Yen", R.drawable.japanflag));
        mainCountryList.add(new CountryItem("Ghanaian Cedi", R.drawable.ghanaflag));
        mainCountryList.add(new CountryItem("Canadian Dollars", R.drawable.canadaflag));
        mainCountryList.add(new CountryItem("UAE Dirham", R.drawable.unitedarabemiratesflag));
        mainCountryList.add(new CountryItem("Swiss Franc", R.drawable.switzerlandflag));
        mainCountryList.add(new CountryItem("Singapore Dollar", R.drawable.singaporeflag));
        mainCountryList.add(new CountryItem("Indonesian Rupiah", R.drawable.indonesiaflag));
        mainCountryList.add(new CountryItem("Danish Krone", R.drawable.denmarkflag));
        mainCountryList.add(new CountryItem("Dominican Peso", R.drawable.dominicanrepublic));
    }
}
