package com.example.moneda;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

//------------

import java.util.HashMap;

//------------


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText text;
    private Spinner spinner1;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.editText);

        spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<String> spinner1Adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.currencies));
        spinner1Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(spinner1Adapter);
        spinner1.setOnItemSelectedListener(this);

        spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<String> spinner2Adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.currencies));
        spinner2Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(spinner2Adapter);
        spinner2.setOnItemSelectedListener(this);

        findViewById(R.id.btnConvertir).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                miClicManejador(view);
            }
        });

        // Set the initial spinner selections
        spinner1.setSelection(0);
        spinner2.setSelection(1);
    }

    public void miClicManejador(View view) {
        float inputValue = Float.parseFloat(text.getText().toString());

        // Obtener las monedas seleccionadas en los spinners
        String currency1 = spinner1.getSelectedItem().toString();
        String currency2 = spinner2.getSelectedItem().toString();

        // Realizar la conversión basada en las monedas seleccionadas
        double result;
        switch (currency1) {
            case "Soles":
                switch (currency2) {
                    case "Dolares":
                        result = convierteSolesADolares(inputValue);
                        break;
                    case "Euros":
                        result = convierteSolesAEuros(inputValue);
                        break;
                    case "Libras":
                        result = convierteSolesALibras(inputValue);
                        break;
                    case "Rupias":
                        result = convierteSolesARupias(inputValue);
                        break;
                    case "Reales":
                        result = convierteSolesAReales(inputValue);
                        break;
                    case "Pesos":
                        result = convierteSolesAPesos(inputValue);
                        break;
                    case "Yuan":
                        result = convierteSolesAYuan(inputValue);
                        break;
                    case "Yen":
                        result = convierteSolesAYen(inputValue);
                        break;
                    default:
                        mostrarMensajeNoSoportado();
                        return;
                }
                break;
            case "Dolares":
                switch (currency2) {
                    case "Soles":
                        result = convierteDolaresASoles(inputValue);
                        break;
                    case "Euros":
                        result = convierteDolaresAEuros(inputValue);
                        break;
                    case "Libras":
                        result = convierteDolaresALibras(inputValue);
                        break;
                    case "Rupias":
                        result = convierteDolaresARupias(inputValue);
                        break;
                    case "Reales":
                        result = convierteDolaresAReales(inputValue);
                        break;
                    case "Pesos":
                        result = convierteDolaresAPesos(inputValue);
                        break;
                    case "Yuan":
                        result = convierteDolaresAYuan(inputValue);
                        break;
                    case "Yen":
                        result = convierteDolaresAYen(inputValue);
                        break;
                    default:
                        mostrarMensajeNoSoportado();
                        return;
                }
                break;

            case "Euros":
                switch (currency2) {
                    case "Soles":
                        result = convierteEurosASoles(inputValue);
                        break;
                    case "Dolares":
                        result = convierteEurosADolares(inputValue);
                        break;
                    case "Libras":
                        result = convierteEurosALibras(inputValue);
                        break;
                    case "Rupias":
                        result = convierteEurosARupias(inputValue);
                        break;
                    case "Reales":
                        result = convierteEurosAReales(inputValue);
                        break;
                    case "Pesos":
                        result = convierteEurosAPesos(inputValue);
                        break;
                    case "Yuan":
                        result = convierteEurosAYuan(inputValue);
                        break;
                    case "Yen":
                        result = convierteEurosAYen(inputValue);
                        break;
                    default:
                        mostrarMensajeNoSoportado();
                        return;
                }
                break;
            case "Libras":
                switch (currency2) {
                    case "Soles":
                        result = convierteLibrasASoles(inputValue);
                        break;
                    case "Dolares":
                        result = convierteLibrasADolares(inputValue);
                        break;
                    case "Euros":
                        result = convierteLibrasAEuros(inputValue);
                        break;
                    case "Rupias":
                        result = convierteLibrasARupias(inputValue);
                        break;
                    case "Reales":
                        result = convierteLibrasAReales(inputValue);
                        break;
                    case "Pesos":
                        result = convierteLibrasAPesos(inputValue);
                        break;
                    case "Yuan":
                        result = convierteLibrasAYuan(inputValue);
                        break;
                    case "Yen":
                        result = convierteLibrasAYen(inputValue);
                        break;
                    default:
                        mostrarMensajeNoSoportado();
                        return;
                }
                break;
            case "Rupias":
                switch (currency2) {
                    case "Soles":
                        result = convierteRupiasASoles(inputValue);
                        break;
                    case "Dolares":
                        result = convierteRupiasADolares(inputValue);
                        break;
                    case "Euros":
                        result = convierteRupiasAEuros(inputValue);
                        break;
                    case "Libras":
                        result = convierteRupiasALibras(inputValue);
                        break;
                    case "Reales":
                        result = convierteRupiasAReales(inputValue);
                        break;
                    case "Pesos":
                        result = convierteRupiasAPesos(inputValue);
                        break;
                    case "Yuan":
                        result = convierteRupiasAYuan(inputValue);
                        break;
                    case "Yen":
                        result = convierteRupiasAYen(inputValue);
                        break;
                    default:
                        mostrarMensajeNoSoportado();
                        return;
                }
                break;
            case "Reales":
                switch (currency2) {
                    case "Soles":
                        result = convierteRealesASoles(inputValue);
                        break;
                    case "Dolares":
                        result = convierteRealesADolares(inputValue);
                        break;
                    case "Euros":
                        result = convierteRealesAEuros(inputValue);
                        break;
                    case "Libras":
                        result = convierteRealesALibras(inputValue);
                        break;
                    case "Rupias":
                        result = convierteRealesARupias(inputValue);
                        break;
                    case "Pesos":
                        result = convierteRealesAPesos(inputValue);
                        break;
                    case "Yuan":
                        result = convierteRealesAYuan(inputValue);
                        break;
                    case "Yen":
                        result = convierteRealesAYen(inputValue);
                        break;
                    default:
                        mostrarMensajeNoSoportado();
                        return;
                }
                break;

            case "Pesos":
                switch (currency2) {
                    case "Soles":
                        result = conviertePesosASoles(inputValue);
                        break;
                    case "Dolares":
                        result = conviertePesosADolares(inputValue);
                        break;
                    case "Euros":
                        result = conviertePesosAEuros(inputValue);
                        break;
                    case "Libras":
                        result = conviertePesosALibras(inputValue);
                        break;
                    case "Rupias":
                        result = conviertePesosARupias(inputValue);
                        break;
                    case "Reales":
                        result = conviertePesosAReales(inputValue);
                        break;
                    case "Yuan":
                        result = conviertePesosAYuan(inputValue);
                        break;
                    case "Yen":
                        result = conviertePesosAYen(inputValue);
                        break;
                    default:
                        mostrarMensajeNoSoportado();
                        return;
                }
                break;
            case "Yuan":
                switch (currency2) {
                    case "Soles":
                        result = convierteYuanesASoles(inputValue);
                        break;
                    case "Dolares":
                        result = convierteYuanesADolares(inputValue);
                        break;
                    case "Euros":
                        result = convierteYuanesAEuros(inputValue);
                        break;
                    case "Libras":
                        result = convierteYuanesALibras(inputValue);
                        break;
                    case "Rupias":
                        result = convierteYuanesARupias(inputValue);
                        break;
                    case "Reales":
                        result = convierteYuanesAReales(inputValue);
                        break;
                    case "Pesos":
                        result = convierteYuanesAPesos(inputValue);
                        break;
                    case "Yen":
                        result = convierteYuanesAYen(inputValue);
                        break;
                    default:
                        mostrarMensajeNoSoportado();
                        return;
                }
                break;
            case "Yen":
                switch (currency2) {
                    case "Soles":
                        result = convierteYenesASoles(inputValue);
                        break;
                    case "Dolares":
                        result = convierteYenesADolares(inputValue);
                        break;
                    case "Euros":
                        result = convierteYenesAEuros(inputValue);
                        break;
                    case "Libras":
                        result = convierteYenesALibras(inputValue);
                        break;
                    case "Rupias":
                        result = convierteYenesARupias(inputValue);
                        break;
                    case "Reales":
                        result = convierteYenesAReales(inputValue);
                        break;
                    case "Pesos":
                        result = convierteYenesAPesos(inputValue);
                        break;
                    case "Yuan":
                        result = convierteYenesAYuan(inputValue);
                        break;
                    default:
                        mostrarMensajeNoSoportado();
                        return;
                }
                break;


            default:
                mostrarMensajeNoSoportado();
                return;
        }

        Log.d("MiClicManejador", "Resultado de la conversión: " + result);
        text.setText(String.valueOf(result));
    }

/* PRUEBA HASH

    public static class MyTextUtils {
        public static boolean isEmpty(CharSequence str) {
            return str == null || str.length() == 0;
        }
    }
    public void miClicManejador(View view) {
        Button button = (Button) view;

        try {
            String currency1 = spinner1.getSelectedItem().toString();

            // Check for empty input or '.'
            if (TextUtils.isEmpty(text.getText().toString()) || text.getText().toString().equals(".")) {
                throw new NumberFormatException();
            }

            float inputValue = Float.parseFloat(text.getText().toString());

            initializeExchangeRates();

            double result;
            switch (currency1) {
                case "Soles":
                    String currency2 = spinner2.getSelectedItem().toString();

                    switch (currency2) {
                        case "Dolares":
                            result = convertCurrency(inputValue, "PEN", "USD");
                            break;
                        case "Euros":
                            result = convertCurrency(inputValue, "PEN", "EUR");
                            break;
                        default:
                            mostrarMensajeNoSoportado();
                            return;
                    }
                    break;

                // Add other currency conversions

            }

            // Display the result
            NumberFormat formatter = NumberFormat.getNumberInstance();
            text.setText(formatter.format(result));

            // Show result in a Toast
            Toast.makeText(this, "Result: " + formatter.format(result), Toast.LENGTH_SHORT).show();

            // Print result to console (Logcat)
            Log.d("CurrencyConverter", "Result: " + formatter.format(result));

        } catch (NumberFormatException e) {
            mostrarMensajeValorInvalido();
        }

        // Reset focus
        text.setFocusable(true);
        text.requestFocus();

        // Clear the soft keyboard
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(spinner1.getWindowToken(), 0);

    }

    private HashMap<String, Double> exchangeRates;

    // Inicializa las tasas de cambio
    private void initializeExchangeRates() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("PEN", 4.03);  // Nuevo sol peruano
    }

    // Realiza la conversión de moneda
    private double convertCurrency(float amount, String fromCurrency, String toCurrency) {
        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);
        return amount * (toRate / fromRate);
    }
    private void mostrarMensajeValorInvalido() {
        // Display a message for invalid input
        text.setError("Ingrese un valor numérico válido");
        text.requestFocus();
    }*/




    // Definir las tasas de cambio fijas
    // ||||||   EUROS   ||||||
    private static final double EURO_A_SOLES = 4.5;
    private static final double EURO_A_LIBRAS = 0.85;
    private static final double EURO_A_DOLARES = 1.21;
    private static final double EURO_A_RUPIAS = 89.57;
    private static final double EURO_A_REALES = 6.55;
    private static final double EURO_A_PESOS = 24.48;
    private static final double EURO_A_YUAN = 7.79;
    private static final double EURO_A_YEN = 137.04;

    // Convierte a Soles desde Euros
    private double convierteEurosASoles(float euros) {
        return euros * EURO_A_SOLES;
    }

    // Convierte a Libras desde Euros
    private double convierteEurosALibras(float euros) {
        return euros * EURO_A_LIBRAS;
    }

    // Convierte a Dólares desde Euros
    private double convierteEurosADolares(float euros) {
        return euros * EURO_A_DOLARES;
    }

    // Convierte a Rupias desde Euros
    private double convierteEurosARupias(float euros) {
        return euros * EURO_A_RUPIAS;
    }

    // Convierte a Reales desde Euros
    private double convierteEurosAReales(float euros) {
        return euros * EURO_A_REALES;
    }

    // Convierte a Pesos desde Euros
    private double convierteEurosAPesos(float euros) {
        return euros * EURO_A_PESOS;
    }

    // Convierte a Yuan desde Euros
    private double convierteEurosAYuan(float euros) {
        return euros * EURO_A_YUAN;
    }

    // Convierte a Yen desde Euros
    private double convierteEurosAYen(float euros) {
        return euros * EURO_A_YEN;
    }
    // ||||||   EUROS - FIN  ||||||
    // ||||||   LIBRAS   ||||||
    private static final double LIBRA_A_SOLES = 5.2;
    private static final double LIBRA_A_EUROS = 1.17;
    private static final double LIBRA_A_DOLARES = 1.37;
    private static final double LIBRA_A_RUPIAS = 101.38;
    private static final double LIBRA_A_REALES = 7.39;
    private static final double LIBRA_A_PESOS = 27.49;
    private static final double LIBRA_A_YUAN = 8.75;
    private static final double LIBRA_A_YEN = 153.11;

    // FUNCIONES DE LIBRA

    // Convierte a Soles desde Libras
    private double convierteLibrasASoles(float libras) {
        return libras * LIBRA_A_SOLES;
    }

    // Convierte a Euros desde Libras
    private double convierteLibrasAEuros(float libras) {
        return libras * LIBRA_A_EUROS;
    }

    // Convierte a Dólares desde Libras
    private double convierteLibrasADolares(float libras) {
        return libras * LIBRA_A_DOLARES;
    }
    // Convierte a Rupias desde Libras
    private double convierteLibrasARupias(float libras) {
        return libras * LIBRA_A_RUPIAS;
    }

    // Convierte a Reales desde Libras
    private double convierteLibrasAReales(float libras) {
        return libras * LIBRA_A_REALES;
    }

    // Convierte a Pesos desde Libras
    private double convierteLibrasAPesos(float libras) {
        return libras * LIBRA_A_PESOS;
    }

    // Convierte a Yuan desde Libras
    private double convierteLibrasAYuan(float libras) {
        return libras * LIBRA_A_YUAN;
    }

    // Convierte a Yen desde Libras
    private double convierteLibrasAYen(float libras) {
        return libras * LIBRA_A_YEN;
    }
    // ||||||   LIBRAS - FIN  ||||||

    // ||||||   RUPIAS  ||||||
    private static final double RUPIA_A_SOLES = 0.046;
    private static final double RUPIA_A_LIBRAS = 0.011;
    private static final double RUPIA_A_EUROS = 0.011;
    private static final double RUPIA_A_DOLARES = 0.014;
    private static final double RUPIA_A_REALES = 0.081;
    private static final double RUPIA_A_PESOS = 0.304;
    private static final double RUPIA_A_YUAN = 0.097;
    private static final double RUPIA_A_YEN = 1.705;

    // Convierte a Soles desde Rupias
    private double convierteRupiasASoles(float rupias) {
        return rupias * RUPIA_A_SOLES;
    }

    // Convierte a Libras desde Rupias
    private double convierteRupiasALibras(float rupias) {
        return rupias * RUPIA_A_LIBRAS;
    }

    // Convierte a Euros desde Rupias
    private double convierteRupiasAEuros(float rupias) {
        return rupias * RUPIA_A_EUROS;
    }

    // Convierte a Dólares desde Rupias
    private double convierteRupiasADolares(float rupias) {
        return rupias * RUPIA_A_DOLARES;
    }

    // Convierte a Reales desde Rupias
    private double convierteRupiasAReales(float rupias) {
        return rupias * RUPIA_A_REALES;
    }

    // Convierte a Pesos desde Rupias
    private double convierteRupiasAPesos(float rupias) {
        return rupias * RUPIA_A_PESOS;
    }

    // Convierte a Yuan desde Rupias
    private double convierteRupiasAYuan(float rupias) {
        return rupias * RUPIA_A_YUAN;
    }

    // Convierte a Yen desde Rupias
    private double convierteRupiasAYen(float rupias) {
        return rupias * RUPIA_A_YEN;
    }

    // ||||||   RUPIAS - FIN  ||||||


    // ||||||   REALES -  ||||||
    // Factores de conversión
    private static final double REALES_A_SOLES = 14.50;
    private static final double REALES_A_EUROS = 0.15;
    private static final double REALES_A_LIBRAS = 0.12;
    private static final double REALES_A_DOLARES = 0.18;
    private static final double REALES_A_RUPIAS = 13.27;
    private static final double REALES_A_PESOS = 4.60;
    private static final double REALES_A_YUAN = 1.46;
    private static final double REALES_A_YEN = 25.63;

    // Funciones de conversión
// Convierte a Soles desde Reales
    private double convierteRealesASoles(float reales) {
        return reales * REALES_A_SOLES;
    }

    // Convierte a Euros desde Reales
    private double convierteRealesAEuros(float reales) {
        return reales * REALES_A_EUROS;
    }

    // Convierte a Libras desde Reales
    private double convierteRealesALibras(float reales) {
        return reales * REALES_A_LIBRAS;
    }

    // Convierte a Dólares desde Reales
    private double convierteRealesADolares(float reales) {
        return reales * REALES_A_DOLARES;
    }

    // Convierte a Rupias desde Reales
    private double convierteRealesARupias(float reales) {
        return reales * REALES_A_RUPIAS;
    }

    // Convierte a Pesos desde Reales
    private double convierteRealesAPesos(float reales) {
        return reales * REALES_A_PESOS;
    }

    // Convierte a Yuan desde Reales
    private double convierteRealesAYuan(float reales) {
        return reales * REALES_A_YUAN;
    }

    // Convierte a Yen desde Reales
    private double convierteRealesAYen(float reales) {
        return reales * REALES_A_YEN;
    }
    // ||||||   REALES  - FIN  ||||||

    // ||||||   PESO M  -  ||||||
    // Factores de conversión
    private static final double PESOS_A_SOLES = 0.74;
    private static final double PESOS_A_EUROS = 0.041;
    private static final double PESOS_A_LIBRAS = 0.035;
    private static final double PESOS_A_DOLARES = 0.050;
    private static final double PESOS_A_RUPIAS = 3.66;
    private static final double PESOS_A_REALES = 0.22;
    private static final double PESOS_A_YUAN = 0.071;
    private static final double PESOS_A_YEN = 1.24;

    // Funciones de conversión
// Convierte a Soles desde Pesos Mexicanos
    private double conviertePesosASoles(float pesos) {
        return pesos * PESOS_A_SOLES;
    }

    // Convierte a Euros desde Pesos Mexicanos
    private double conviertePesosAEuros(float pesos) {
        return pesos * PESOS_A_EUROS;
    }

    // Convierte a Libras desde Pesos Mexicanos
    private double conviertePesosALibras(float pesos) {
        return pesos * PESOS_A_LIBRAS;
    }

    // Convierte a Dólares desde Pesos Mexicanos
    private double conviertePesosADolares(float pesos) {
        return pesos * PESOS_A_DOLARES;
    }

    // Convierte a Rupias desde Pesos Mexicanos
    private double conviertePesosARupias(float pesos) {
        return pesos * PESOS_A_RUPIAS;
    }

    // Convierte a Reales desde Pesos Mexicanos
    private double conviertePesosAReales(float pesos) {
        return pesos * PESOS_A_REALES;
    }

    // Convierte a Yuan desde Pesos Mexicanos
    private double conviertePesosAYuan(float pesos) {
        return pesos * PESOS_A_YUAN;
    }

    // Convierte a Yen desde Pesos Mexicanos
    private double conviertePesosAYen(float pesos) {
        return pesos * PESOS_A_YEN;
    }
    // ||||||   PESO M  - FIN  ||||||

    // ||||||   YUN -  ||||||
    private static final double YUAN_A_SOLES = 0.52;
    private static final double YUAN_A_EUROS = 0.12;
    private static final double YUAN_A_LIBRAS = 0.11;
    private static final double YUAN_A_DOLARES = 0.15;
    private static final double YUAN_A_RUPIAS = 10.96;
    private static final double YUAN_A_REALES = 0.80;
    private static final double YUAN_A_PESOS = 14.08;
    private static final double YUAN_A_YEN = 17.58;

    // Funciones de conversión
// Convierte a Soles desde Yuanes
    private double convierteYuanesASoles(float yuanes) {
        return yuanes * YUAN_A_SOLES;
    }

    // Convierte a Euros desde Yuanes
    private double convierteYuanesAEuros(float yuanes) {
        return yuanes * YUAN_A_EUROS;
    }

    // Convierte a Libras desde Yuanes
    private double convierteYuanesALibras(float yuanes) {
        return yuanes * YUAN_A_LIBRAS;
    }

    // Convierte a Dólares desde Yuanes
    private double convierteYuanesADolares(float yuanes) {
        return yuanes * YUAN_A_DOLARES;
    }

    // Convierte a Rupias desde Yuanes
    private double convierteYuanesARupias(float yuanes) {
        return yuanes * YUAN_A_RUPIAS;
    }

    // Convierte a Reales desde Yuanes
    private double convierteYuanesAReales(float yuanes) {
        return yuanes * YUAN_A_REALES;
    }

    // Convierte a Pesos desde Yuanes
    private double convierteYuanesAPesos(float yuanes) {
        return yuanes * YUAN_A_PESOS;
    }

    // Convierte a Yen desde Yuanes
    private double convierteYuanesAYen(float yuanes) {
        return yuanes * YUAN_A_YEN;
    }
    // ||||||   YUN  - FIN  ||||||

    // ||||||   YEN -  ||||||
    // Factores de conversión
    private static final double YEN_A_SOLES = 0.03;
    private static final double YEN_A_EUROS = 0.0081;
    private static final double YEN_A_LIBRAS = 0.0073;
    private static final double YEN_A_DOLARES = 0.010;
    private static final double YEN_A_RUPIAS = 0.73;
    private static final double YEN_A_REALES = 0.054;
    private static final double YEN_A_PESOS = 0.96;
    private static final double YEN_A_YUAN = 0.057;

    // Funciones de conversión
// Convierte a Soles desde Yenes
    private double convierteYenesASoles(float yenes) {
        return yenes * YEN_A_SOLES;
    }

    // Convierte a Euros desde Yenes
    private double convierteYenesAEuros(float yenes) {
        return yenes * YEN_A_EUROS;
    }

    // Convierte a Libras desde Yenes
    private double convierteYenesALibras(float yenes) {
        return yenes * YEN_A_LIBRAS;
    }

    // Convierte a Dólares desde Yenes
    private double convierteYenesADolares(float yenes) {
        return yenes * YEN_A_DOLARES;
    }

    // Convierte a Rupias desde Yenes
    private double convierteYenesARupias(float yenes) {
        return yenes * YEN_A_RUPIAS;
    }

    // Convierte a Reales desde Yenes
    private double convierteYenesAReales(float yenes) {
        return yenes * YEN_A_REALES;
    }

    // Convierte a Pesos desde Yenes
    private double convierteYenesAPesos(float yenes) {
        return yenes * YEN_A_PESOS;
    }

    // Convierte a Yuan desde Yenes
    private double convierteYenesAYuan(float yenes) {
        return yenes * YEN_A_YUAN;
    }
    // ||||||   YEN  - FIN  ||||||

    // ||||||   DOLAR -  ||||||
    // Factores de conversión
    private static final double DOLAR_A_SOLES = 3.8;
    private static final double DOLAR_A_EUROS = 0.82;
    private static final double DOLAR_A_LIBRAS = 0.73;
    private static final double DOLAR_A_RUPIAS = 73.58;
    private static final double DOLAR_A_REALES = 5.38;
    private static final double DOLAR_A_PESOS = 19.93;
    private static final double DOLAR_A_YUAN = 6.35;
    private static final double DOLAR_A_YEN = 110.42;

    // Funciones de conversión
// Convierte a Soles desde Dólares
    private double convierteDolaresASoles(float dolares) {
        return dolares * DOLAR_A_SOLES;
    }

    // Convierte a Euros desde Dólares
    private double convierteDolaresAEuros(float dolares) {
        return dolares * DOLAR_A_EUROS;
    }

    // Convierte a Libras desde Dólares
    private double convierteDolaresALibras(float dolares) {
        return dolares * DOLAR_A_LIBRAS;
    }

    // Convierte a Rupias desde Dólares
    private double convierteDolaresARupias(float dolares) {
        return dolares * DOLAR_A_RUPIAS;
    }

    // Convierte a Reales desde Dólares
    private double convierteDolaresAReales(float dolares) {
        return dolares * DOLAR_A_REALES;
    }

    // Convierte a Pesos desde Dólares
    private double convierteDolaresAPesos(float dolares) {
        return dolares * DOLAR_A_PESOS;
    }

    // Convierte a Yuan desde Dólares
    private double convierteDolaresAYuan(float dolares) {
        return dolares * DOLAR_A_YUAN;
    }

    // Convierte a Yen desde Dólares
    private double convierteDolaresAYen(float dolares) {
        return dolares * DOLAR_A_YEN;
    }

    // ||||||   DOLAR  - FIN  ||||||

    // ||||||   SOLES -  ||||||
// Factores de conversión
    private static final double SOL_A_DOLARES = 0.26;
    private static final double SOL_A_EUROS = 0.22;
    private static final double SOL_A_LIBRAS = 0.20;
    private static final double SOL_A_RUPIAS = 20.07;
    private static final double SOL_A_REALES = 1.47;
    private static final double SOL_A_PESOS = 5.46;
    private static final double SOL_A_YUAN = 1.74;
    private static final double SOL_A_YEN = 30.31;

    // Funciones de conversión
// Convierte a Dólares desde Soles
    private double convierteSolesADolares(float soles) {
        return soles * SOL_A_DOLARES;
    }

    // Convierte a Euros desde Soles
    private double convierteSolesAEuros(float soles) {
        return soles * SOL_A_EUROS;
    }

    // Convierte a Libras desde Soles
    private double convierteSolesALibras(float soles) {
        return soles * SOL_A_LIBRAS;
    }

    // Convierte a Rupias desde Soles
    private double convierteSolesARupias(float soles) {
        return soles * SOL_A_RUPIAS;
    }

    // Convierte a Reales desde Soles
    private double convierteSolesAReales(float soles) {
        return soles * SOL_A_REALES;
    }

    // Convierte a Pesos desde Soles
    private double convierteSolesAPesos(float soles) {
        return soles * SOL_A_PESOS;
    }

    // Convierte a Yuan desde Soles
    private double convierteSolesAYuan(float soles) {
        return soles * SOL_A_YUAN;
    }

    // Convierte a Yen desde Soles
    private double convierteSolesAYen(float soles) {
        return soles * SOL_A_YEN;
    }

    // ||||||   SOLES  - FIN  ||||||

    // Implement OnItemSelectedListener
    private void mostrarMensajeNoSoportado() {
        Toast.makeText(MainActivity.this, "Conversión no soportada", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
        // Aquí puedes realizar acciones cuando se selecciona un elemento en cualquiera de los spinners
        // Pero en este caso, no necesitamos realizar acciones adicionales aquí
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // Método requerido, pero en este caso, no necesitamos implementarlo
    }
}
