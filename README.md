# spark-TPC-DS-demo
A test demo about TPC-DS running on Spark.

Test version:

   Spark version:2.0.2+

   TPC-DS version:2.4.0+


Usage:

1. download tpc-ds:
    building your test data for 10G, 100G or more
    
        ./dsdgen -scale 100 -dir /{your-tpcds-data-dir} -paraller 10

2. download spark:
    import spark/jar to this project as lib.
    
3. build and get tpcds.jar

4. submit jar with spark-submit:

       ./bin/spark-submit  /foo/tpcds.jar  /{your-tpcds-data-dir} ...other custom settings
       
5. get the query time consuming.
