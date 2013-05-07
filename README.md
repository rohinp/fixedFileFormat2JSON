fixedfileformat2pojo
====================

This project came with an intention similar to fixedformat4j.
The difference is 
1> Instead of user creating classes with getter setters.
2> putting all that anotations for configuration on functions inside the class.
3> The project aims on user creating just a json configuration.
4> The system will read fixed format files and return objects as per configured in json.

Example Json will look like this:
{
  "name":"Employee",
	"fields":[
		{
			"name":"eid",
			"length":"5",
			"datatype":"long",
			"filling":"space",
			"index":"1"
		},
		{
			"name":"fname",
			"length":"10",
			"datatype":"string",
			"filling":"space",
			"index":"2"
		},
		{
			"name":"lname",
			"length":"10",
			"datatype":"string",
			"filling":"space",
			"index":"3"
		},
		{
			"name":"salary",
			"length":"8",
			"datatype":"double",
			"fillingleft":"space",
			"fillingright":"0",
			"beforedecimal":"5",
			"afterdecimal":"2",
			"index":"4"
		}
	]
}

more documentation to come, as I am still working on the project.

