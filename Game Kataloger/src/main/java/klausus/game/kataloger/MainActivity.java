package klausus.game.kataloger;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.AlertDialog;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        // Abrimos la base de datos 'DB' en modo lectura y la cerramos.
        SQLiteHelper sql = new SQLiteHelper(this, getString(R.string.DB_name) , null, R.integer.DB_Version);
        SQLiteDatabase db = sql.getReadableDatabase();
        db.close();

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent i = null;
        switch (item.getItemId())
        {
            case R.id.menu_search:
                                    onClickNotImplemented(null);
                                    break;
            case R.id.menu_barcode:
                                    onClickNotImplemented(null);
                                    break;
            case R.id.menu_genres:
                                    i = new Intent(this, GenresActivity.class);
                                    break;
            case R.id.menu_platforms:
                                    onClickNotImplemented(null);
                                    break;
            case R.id.menu_settings:
                                    onClickNotImplemented(null);
                                    break;

            default: return true;
        }

        if(i!=null) startActivity(i);
        return true;
    }

    public void onClickNotImplemented(View v)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Funcion No Implementada");
        alertDialog.setMessage("La funcion que intente ejecutar no esta implementada actualmente." + "\n\n\n" + "Disculpe las molestias, Gracias.");
        alertDialog.show();
    }
    
}
