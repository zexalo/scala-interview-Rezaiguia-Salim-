package com.particeep.test

object BasicScala extends App{


  /**
   * Encode parameter in url format
   *
   * Example:
   *
   * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
   * output : "?sort_by=name&order_by=asc&user_id=12"
   *
   * input  : Map()
   * output : ""
   */
  def encodeParamsInUrl(params: Map[String, String]):String = {

    var result : String = "?"
    params.keys.foreach{ i =>
      if(params.last._1==i){//if it's the last values we need to change the syntaxes
        result+=i+"="+params(i)
        result+=""
      }else if(params.isEmpty) {
        result="";
      }else{//basic syntaxes of url
        result+=i+"="
        result+=params(i)+"&"
      }



    }
    return result



  }


  /**
   * Test if a String is an email
   */
  // i used a simple Regex
  def isEmail(maybeEmail: String):Boolean = if("""(\w+)@([\w\.]+)""".r.findFirstIn(maybeEmail) == None)false else true





  /**
   * Compute i ^ n
   *
   * Example:
   *
   * input : (i = 2, n = 3) we compute 2^3=2x2x2
   * output : 8
   *
   * input : (i = 99, n = 38997)
   * output : 1723793299
   */
  def power(i:Int, n:Int):Int = {
    var r=1

    for (c <- 1 to n){// multily by the values by itself for each iteration
      r*=i
    }
    return r}


  //test of basic functions
  var test = Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
  var a = encodeParamsInUrl(test)
  println(a)
  println(isEmail("salim@gmail.com"))


}

