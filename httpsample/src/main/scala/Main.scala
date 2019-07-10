import scalaj.http._
import play.api.libs.json._

object FunWithScala extends App{
     //Get Request
     val getResponse: HttpResponse[String] = Http("http://localhost:3000/all").asString
     val allStudentsJson:JsValue=Json.parse(getResponse.body)
     val  allStudents=(allStudentsJson \ "students").as[List[String]]
     allStudents.foreach(row=>println(row))

    println("<==================================>")    
     //Post Request
     val name="Bhumij Gupta"
     val data=s"""{"name":"$name"}"""
     val postResponse:HttpResponse[String] =Http("http://localhost:3000/add").postData(data).header("content-type", "application/json").asString
     val allStudentsJsonPost:JsValue=Json.parse(postResponse.body)
     val  allStudentsPost=(allStudentsJsonPost \ "students").as[List[String]]
     allStudentsPost.foreach(row=>println(row))   
}