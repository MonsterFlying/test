

import java.util.List;
import java.util.Set;

import javax.persistence.Temporal;
import org.bson.types.ObjectId;

import sun.jdbc.odbc.OdbcDef;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;



public class Test {
	
	public static void main(String[] args) {
				int num=0;
				MongoClient mc=new MongoClient("localhost",27017);	
				@SuppressWarnings("deprecation")
				DB db=mc.getDB("mydb");
				DBCollection dbc= db.getCollection("person");    //获取集合对象
				
				//添加索引
//				dbc.createIndex(new BasicDBObject("_id",1));
//				
//				List<DBObject> indexObj=dbc.getIndexInfo();
//				
//				for (DBObject dbObject : indexObj) {
//					
//					System.out.println(dbObject);
//					
//				}
//				
//				BasicDBObject ddb=new BasicDBObject();
//				ddb.put("name","yume");
//				ddb.put("heigth",196);
//				ddb.put("age",45);
//				ddb.put("address","江西省赣州市代发县");
//				ddb.put("scores","[255,585,555]");
//			    System.out.println(dbc.save(ddb).getN());
				
				//根据ID查询对象
//				DBObject obj=dbc.findOne(new ObjectId("553093b6e3c59fa9fd74be41"));	
//				System.out.println(obj);
			
				//查询所有
//				DBCursor cursor= dbc.find();			
//				for (DBObject obj : cursor) {
//					System.out.println(obj);
//				}
//				
				
				//根据条件查询
				
				BasicDBObject query=new BasicDBObject();
				query.put("name","chen");
				query.put("heigth",181);
				//query.put("age", "25");
				DBCursor cursor=dbc.find(query.append("age",new BasicDBObject("$gte",10).append("$lte",30)));
				for (DBObject obj : cursor) {
					System.out.println(obj);
				}
					
				//DBObject  obj= new BasicDBObject();    //获取文档对象
//			    obj.put("age",new BasicDBObject("$lte",52));
//			    obj.put("_id", new ObjectId("55309702e3c59fa9fd74be42"));
////			    obj.put("age","25");
//			    obj.put("name", "张山");
			//  Set<String> collName=db.getCollectionNames();
//			    List<DBObject>objs = dbc.find(new BasicDBObject("age",new BasicDBObject(QueryOperators.IN,new int[]{23,20}).append(QueryOperators.EXISTS,true))).toArray();
//			    
//			    for (DBObject dbObject : objs) {
//					System.out.println(dbObject.get("score"));
//				}
//
//		
	    }
}
