package klausus.game.kataloger;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Klausus on 10/08/13.
 */

public class SQLiteHelper extends SQLiteOpenHelper {

    //Sentencia SQL para crear la tabla de Usuarios
    String CreateTable_Genres  = "CREATE TABLE Genres  (name TEXT PRIMARY KEY NOT NULL)";

    public SQLiteHelper(Context context, String dbname, CursorFactory factory, int version)
    {
        super(context, dbname, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(CreateTable_Genres);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva)
    {
        //TODO Actualizacion BD
    }
}
