# spark-TPC-DS-demo
A test demo about TPC-DS running on Spark.

Spark version:2.0.2+

TPC-DS version:2.4.0+



Usage:

1. download tpc-ds:
    building your test data for 10G, 100G or more

2. download spark
    import spark/jar to this project lib.
    
3. build and get tpcds.jar

4. submit jar with spark-submit:

       ./bin/spark-submit  /foo/tpcds.jar  /{your-tpcds-data-dir} ...other custom settings
