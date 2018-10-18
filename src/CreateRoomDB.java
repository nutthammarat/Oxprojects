
import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.*;
import java.util.*;


public class CreateRoomDB {
    static MongoClientURI uri = new MongoClientURI("mongodb://admin:password1@ds135866.mlab.com:35866/oxproject");
    static MongoClient client = new MongoClient(uri);
    static MongoDatabase db = client.getDatabase(uri.getDatabase());
    static MongoCollection<Document> col = db.getCollection("rooms");
    
    
    public static void createRoom(String name,int round) {
        col.insertOne(new Document("name", name).append("units", (int) 1).append("rounds", (int)round));
    }
    
}
