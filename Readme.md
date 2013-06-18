<pre>
<hr>Project: convert2JSON  
Author : Rohin Patel   
<hr>
</pre>

<b>Description</b>: <br>This is a simple tool which converts fixed format file data to JSON, which in turn can be used with AVRO or other tools which use JSON as data format.
			 
<b>What it does?</b> 
- For now the tool only converts the record read from fixed format file to a specific JSON format given below:
- E.g. {"name":"rohin","project":"convert2JSON","team":"DART"}
	
<b>Note</b>: We can convert one file format to JSON at a time, can't give multiple file formats simultaneously. 
      Working on it :-)
	
<b>What more can be done?</b>
- multiple file format given at a time.
- XML to JSON data ingestion on Hadoop.
	
<b>How to use it?</b>
- put your class properties file again in resource folder(Sample check in the resource folder)
- Use com.mytool.avroschema.formater.JSONRecord class to convert record by record data to JSON. 
(Check the test cases for syntax and use)
