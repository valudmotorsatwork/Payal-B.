<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="kendo" uri="http://www.kendoui.com/jsp/tags"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kendo Jdbc </title>
 <link href="styles/kendo.common.min.css" rel="stylesheet">
  <link href="styles/kendo.default.min.css" rel="stylesheet">
  
  <script src="js/jquery.min.js"></script>
  <script src="js/kendo.all.min.js"></script>
</head>
<body>
<h3>City Table</h3>
<div class = "container"> 
	<div class = "row">
		<div class = "span12">
<kendo:grid name="CreateRequest" pageable="true" resizable="true">
<kendo:grid-editable mode="popup" confirmation="Are you sure you want to delete the record??"/>
<kendo:grid-pageable pageSizes="true" refresh="true" buttonCount="3"/>
			<kendo:grid-toolbar>
				<kendo:grid-toolbarItem name ="create" />
			</kendo:grid-toolbar>
	<kendo:dataSource pageSize="5">
		<kendo:dataSource-transport>
			<kendo:dataSource-transport-read url="CityController"/>
			<kendo:dataSource-transport-update url="CityController?action=update" type="post"/>
			<kendo:dataSource-transport-destroy url="CityController?action=delete" type="post"/>
			<kendo:dataSource-transport-create url="CityController?action=insert" type="post"/>
		</kendo:dataSource-transport>
		<kendo:dataSource-schema >
			<kendo:dataSource-schema-model id="id">
			<kendo:dataSource-schema-model-fields>	
				<kendo:dataSource-schema-model-field name="name">
					<kendo:dataSource-schema-model-field-validation required="true"/>
				</kendo:dataSource-schema-model-field>
				<kendo:dataSource-schema-model-field name="countryCode">
				<kendo:dataSource-schema-model-field-validation required="true" />
				</kendo:dataSource-schema-model-field>
				<kendo:dataSource-schema-model-field name="district">
				<kendo:dataSource-schema-model-field-validation required="true" />
				</kendo:dataSource-schema-model-field>
				<kendo:dataSource-schema-model-field name="population">
				<kendo:dataSource-schema-model-field-validation required="true" />
				</kendo:dataSource-schema-model-field>
			</kendo:dataSource-schema-model-fields>
			</kendo:dataSource-schema-model>
		</kendo:dataSource-schema>
	</kendo:dataSource>
	
	<kendo:grid-columns>
		
		<kendo:grid-column title="Name" field="name"></kendo:grid-column>
		<kendo:grid-column title="CountryCode" field="countryCode"></kendo:grid-column>
		<kendo:grid-column title="District" field="district"></kendo:grid-column>
		<kendo:grid-column title="Population" field="population"></kendo:grid-column>
		<kendo:grid-column>
		<kendo:grid-column-command>
		<kendo:grid-column-commandItem name="edit" />
		<kendo:grid-column-commandItem name="destroy"/>
	
		</kendo:grid-column-command>
		</kendo:grid-column>
	</kendo:grid-columns>
</kendo:grid>
</div>
</div>
</div>
</body>
</html>