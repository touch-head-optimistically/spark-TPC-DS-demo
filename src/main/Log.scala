package main

import java.text.SimpleDateFormat
import java.util.Date

/**
  * Created by zz on 2017.
  *
  * Log.scala
  *
  * log
  *
  *
  */
object Log{

  def info(message :String): Unit ={

    val dateFormatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss")
    var nowtime = new Date()
    var now = dateFormatter.format(nowtime)

    println("[INFO]" + " [" + now + "] " + message)
  }

  def warn(message: String): Unit ={

    val dateFormatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss")
    var nowtime = new Date()
    var now = dateFormatter.format(nowtime)

    println("[WARN]" + " [" + now + "] " + message)
  }

  def error(message: String): Unit = {

    val dateFormatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss")
    var nowtime = new Date()
    var now = dateFormatter.format(nowtime)

    println("[ERROR]" + "[" + now + "] " + message)
  }
}
