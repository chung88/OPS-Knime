OPS-Knime
=========

The OPS-Knime project has three goals:
<ul><li> To easily include  <a href="http://dev.openphacts.org">OpenPHACTS services </a> in a  <a href="http://www.knime.org/">Knime</a> workflow </li>
<li> To create a KNIME community nodes that provides functionality include RESTful services in a KNIME workflow where the services themselves are described in a SWAGGER file</li>
<li> to give the Knime community easy access to the OpenPHACTS services. 
OPS-Knime is a project devoted to ease the process of including into the  workflow engine.
where:<br/>
<ul><li>OpenPHACTS reduces the barriers to drug discovery in industry, academia and for small businesses. </li>
<li>
Knime offers a workflow system by implementing a low-barrier visual programming environment for researchers dependent on data and statistical data-crunching methods/algorithms.
</li> 
</ul>
In other words: <b>OpenPHACTS</b> gives pharmacologists easy access to a wide range of data relevant to their research and <b>Knime</b> allows scientists to partially automate their research workflows which
are part of their research process.   
The more generic purpose of OPS-Knime is to make it easier to integrate Restful services in Knime via some utility nodes that are able to deal with SWAGGER files and JSON files.



KNIME-UTILS: OPS_SWAGGER & OPS_JSON
----------
The <a href="http://dev.openphacts.org">OpenPHACTS services</a> are accessible via HTTP-GET .
These services are described in <a href="https://developers.helloreverb.com/swagger/">SWAGGER</a>, and rendered by <a href="http://www.3scale.net/">3scale</a> into convenient, human-readable html documentation. 
The latest swagger file for the OpenPHACTS version 1.3 can be found <a href="https://raw.github.com/openphacts/OPS_LinkedDataApi/1.3.0/api-config-files/swagger.json">here </a>, and the visualisation is <a href="https://dev.openphacts.org/docs/1.3"> here </a>
SWAGGER is an easy way to describe REST services. 
It contains all the necessary information needed to be able
to understand the purpose and how to technically invoke  services that are provided. For example the address of the server, the path to the services and the parameters
that the services require or which are optional to fine-tune the desired functionality of the service.


The OPS-Knime project to give the Knime community easy access to the OpenPHACTS services. 


<ul><li><b>OPS_SWAGGER</b><br/>

This node parses a SWAGGER file which is loaded via the config panel. The user selects a service from a list that is generated by the parser. 
After selecting the service, a parameter panel allows the user to specify the default parameter settings for that service. 
The input table contains exactly one row, where the column headers are the parameter names for the service selected by the user and the cells
are the values for the respective parameters.
 
</li>
<li><b>OPS_JSON</b><br/>
OPS_JSON transforms a nested JSON structure in two KNIME tables. The first output table contains the results according to the specified json-paths
the user wants to have, and the second table is the complete transformed JSON result. </li></ul>

#Installation

* Download "org.openphacts.utils.json_1.0.0.zip" [download](https://github.com/openphacts/OPS-Knime/raw/master/org.openphacts.utils.json_1.0.0.zip) and unzip it in the plugins folder of your KNIME installation
   * on the Mac the plug-ins folder is under the Knime application 
* Download the example workflow (OPS_KNIME 1.4-example-workflow.zip)
* Start your Knime environment (you should see already a couple of new nodes at the left, like OPS_KNIME)
* import the example workflow (file>>import-workflow...>>select archive file)

#Running
* Double click on the example workflow
* Reset the input table (click on input table, then click on table icon with red cross)
* Execute the node (click on the green 'play' button).




OpenPHACTS Services 
----------
Some example workflow that uses both the OPS_SWAGGER and OPS_JSON nodes in the OpenPHACTS context. 



Development - Source
----------
The source code of the plugins are in the folder "OPS-Knime" folder which can be checked out as
a java project in Knime-Eclipse.

The source of the metanodes is in the 'metanodes' directory

TODO
-------------
* more nodes
* better nodes

for any questions or feedback, please send a mail to rm.siebes'''''AT'''''few.vu.nl
