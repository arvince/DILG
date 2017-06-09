package com.dilg.dilg;

import com.dilg.dilg.TableMainLayout;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

//    private String TAG = Result1.class.getSimpleName();
//
//    private ProgressDialog pDialog;
//    private ListView lv;
//
//    // URL to get contacts JSON
//    private static String url = "https://script.google.com/macros/s/AKfycbxOLElujQcy1-ZUer1KgEvK16gkTLUqYftApjNCM_IRTL3HSuDk/exec?id=1wGHKRWA9PCZelTiNYH7EgSf8F6Lt9abRrSfjqXwdbdY&sheet=ABRA";
//
//    static ArrayList<HashMap<String, String, String>> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TableMainLayout(this));
//
//        results = new ArrayList<>();
//
//        lv = (ListView) findViewById(R.id.list);
//
//        new GetResults().execute();
    }

    /**
     * Async task class to get json by making HTTP call
     */
//    private class GetResults extends AsyncTask<Void, Void, Void> {
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//            // Showing progress dialog
//            pDialog = new ProgressDialog(MainActivity.this);
//            pDialog.setMessage("Please wait...");
//            pDialog.setCancelable(false);
//            pDialog.show();
//
//        }
//
//        @Override
//        protected Void doInBackground(Void... arg0) {
//            HttpHandler sh = new HttpHandler();
//
//            // Making a request to url and getting response
//            String jsonStr = sh.makeServiceCall(url);
//
//            Log.e(TAG, "Response from url: " + jsonStr);
//
//            if (jsonStr != null) {
//                try {
//                    JSONObject jsonObj = new JSONObject(jsonStr);
//
//                    // Getting JSON Array node
//                    JSONArray result = jsonObj.getJSONArray("ABRA");
//
//                    // looping through All Contacts
//                    for (int i = 0; i < result.length(); i++) {
//                        JSONObject c = result.getJSONObject(i);
//
//                        String head1 = c.getString("");
//                        String head2 = c.getString("Complied_/_Status");
//                        String head3 = c.getString("Total_Target");
//
//
//                        // tmp hash map for single contact
//                        HashMap<String, String, String> respond = new HashMap<>();
//
//                        // adding each child node to HashMap key => value
//                        respond.put("", head1);
//                        respond.put("Complied_/_Status", head2);
//                        respond.put("Total_Target", head3);
//
//
//                        // adding contact to contact list
//                        results.add(respond);
//                    }
//                } catch (final JSONException e) {
//                    Log.e(TAG, "Json parsing error: " + e.getMessage());
//                    runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                            Toast.makeText(getApplicationContext(),
//                                    "Json parsing error: " + e.getMessage(),
//                                    Toast.LENGTH_LONG)
//                                    .show();
//                        }
//                    });
//
//                }
//            } else {
//                Log.e(TAG, "Couldn't get json from server.");
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Toast.makeText(getApplicationContext(),
//                                "Couldn't get json from server. Check LogCat for possible errors!",
//                                Toast.LENGTH_LONG)
//                                .show();
//                    }
//                });
//
//            }
//
//            return null;
//
//        }
//
//        @Override
//        protected void onPostExecute(Void result) {
//            super.onPostExecute(result);
//            // Dismiss the progress dialog
//            if (pDialog.isShowing())
//                pDialog.dismiss();
//            /**
//             * Updating parsed JSON data into ListView
//             * */
//            ListAdapter adapter = new SimpleAdapter(
//                    MainActivity.this, results,
//                    R.layout.content_result, new String[]{"Complied_/_Status", "Total_Target"}, new int[]{R.id.name,
//                    R.id.title});
//
//            lv.setAdapter(adapter);
//        }
//
//    }
}
