Tool: convert2JSON

Description: This is a simple tool which converts fixed format file data to JSON, 
			 which in turn can be used with AVRO or other tools which use JSON a data format.
			 
What it does? 
	For now the tool only converts the record read from fixed format file to a specific JSON format given below:
	E.g.
	{"name":"rohin","project":"convert2JSON","team":"DART"}
	
	Note: We can convert one file format to JSON at a time, can't give multiple file formats simultaneously. working on it :-)
	
What more can be done?
	1> multiple file format given at a time.
	2> XML to JSON data ingestion on Hadoop.
	
How to use it?
1> put your avro schema file in resource folder.
2> put your class properties file again in resource folder(Sample check in the resource folder)
3> Use com.mytool.avroschema.formater.JSONRecord class to convert record by record data to JSON. (Check the test cases for syntax and use)


Note: 
To use the project in your Eclipse IDE.
run gradle with following command, it will help you to create your eclipse specific files and set the class paths.
run on the terminal/cmd
$> gradle eclipse