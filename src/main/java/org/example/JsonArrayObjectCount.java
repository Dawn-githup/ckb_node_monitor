package org.example;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import static io.restassured.RestAssured.given;

public class JsonArrayObjectCount {
        public int getNode() {
            String jsonArray = given()
                    .header("Content-Type","application/json; charset=utf-8")
                    .get("https://api-nodes.ckb.dev/peer").asString();

            // 使用 Gson 解析 JSON 数组
            JsonArray jsonArrayObj = JsonParser.parseString(jsonArray).getAsJsonArray();

            // 统计 JSON 对象的数量
            int objectCount = jsonArrayObj.size();
            System.out.println("JSON 数组中包含 " + objectCount + " 个 JSON 对象。");
            return objectCount;
        }
}
