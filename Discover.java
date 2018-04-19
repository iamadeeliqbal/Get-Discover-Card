package innowi.testapp;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by adeel_iqbal on 3/26/2018.
 */

public class Discover {

    private static final String TAG = "Discover Card Type";

    String accountNumber = "6506100112345678";  // sample account number
    String res;
    int IIN;

    public void GetCardType()
    {
       // Log.d(TAG, "discover");
        res = accountNumber.substring(0,8);
        IIN = Integer.parseInt(res);
        //Log.d(TAG, IIN);
        if (IIN >= 30000000 && IIN <= 30599999)
        {
            Log.d(TAG,"DCI");
        }
        else if(IIN >= 30950000 && IIN <= 30959999)
        {
            Log.d(TAG,"DCI");
        }
        else if(IIN >= 35280000 && IIN <= 35899999)
        {
            Log.d(TAG,"JCB");
        }
        else if(IIN >= 36000000 && IIN <= 36999999)
        {
            Log.d(TAG,"DCI");
        }
        else if(IIN >= 38000000 && IIN <= 39999999)
        {
            Log.d(TAG,"DCI");
        }
        else if(IIN >= 60110000 && IIN <= 60110399)
        {
            Log.d(TAG,"DN");
        }
        else if(IIN >= 60110400 && IIN <= 60110499)
        {
            Log.d(TAG,"PayPal");
        }
        else if(IIN >= 60110500 && IIN <= 60110999)
        {
            Log.d(TAG,"DN");
        }
        else if(IIN >= 60112000 && IIN <= 60114999)
        {
            Log.d(TAG,"DN");
        }
        else if(IIN >= 60117400 && IIN <= 60117499)
        {
            Log.d(TAG,"DN");
        }
        else if(IIN >= 60117700 && IIN <= 60117999)
        {
            Log.d(TAG,"DN");
        }
        else if(IIN >= 60118600 && IIN <= 60119999)
        {
            Log.d(TAG,"DN");
        }
        else if(IIN >= 62212600 && IIN <= 62292599)
        {
            Log.d(TAG,"UnionPay");
        }
        else if(IIN >= 62400000 && IIN <= 62699999)
        {
            Log.d(TAG,"UnionPay");
        }
        else if(IIN >= 62820000 && IIN <= 62889999)
        {
            Log.d(TAG,"UnionPay");
        }
        else if(IIN >= 64400000 && IIN <= 65059999)
        {
            Log.d(TAG,"DN");
        }
        else if(IIN >= 65060000 && IIN <= 65060099)
        {
            Log.d(TAG,"PayPal");
        }
        else if(IIN >= 65060100 && IIN <= 65060999)
        {
            Log.d(TAG,"DN");
        }
        else if(IIN >= 65061000 && IIN <= 65061099)
        {
            Log.d(TAG,"PayPal");
        }
        else if(IIN >= 65061100 && IIN <= 65999999)
        {
            Log.d(TAG,"DN");
        }
        else
        {
            Log.d(TAG,"Wrong INN");
        }
    }
}

