package incture.com.myapplication.net;

import android.util.Base64;

import java.io.UnsupportedEncodingException;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ritwik.Jain on 3/9/2018.
 */

public class RestClient {

    static void getRestClientService (){
        TripService service = retrofit.create(TripService.class);
    }

    public static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {
        if(retrofit == null){
            return initRetrofit();
        }
        return retrofit;
    }

    private static Retrofit initRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://metrodatarestwebcddd63e4a.ap1.hana.ondemand.com/MetroData_RestWeb/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    public static String getAuthToken() {
        byte[] data = new byte[0];
        try {
            data = ("p000004" + ":" + "Incture@123").getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "Basic " + Base64.encodeToString(data, Base64.NO_WRAP);
    }
}
