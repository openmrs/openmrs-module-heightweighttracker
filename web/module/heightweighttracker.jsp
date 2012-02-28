<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<%@ page import="java.util.*" %>
<%@ page import="org.openmrs.*" %>
<%@ page import="org.openmrs.module.heightweighttracker.mapper.*" %>
<%@ page import="org.openmrs.module.heightweighttracker.web.*" %>

<%@ include file="templates/include.jsp"%>
<%@ include file="templates/header.jsp"%>

<!-- Create htmlInclude tag that takes media -->
<openmrs:globalProperty key="heightweighttracker.Form_New" var="Form_New"/>

<%@ include file="fragments/popup.jspf"%>

<script type="text/javascript">
		
		<c:if test="${!empty formData.obsMapper.heightForAge}">
		var dataHeight = [];
		var sd3 = [];
		var sd2 = [];
		var sd1 = [];
		var sd0 = [];
		var sd1neg = [];
		var sd2neg = [];
		var sd3neg = [];
		
		<c:forEach var="o" items="${formData.obsMapper.heightForAge}">
			dataHeight.push([ ${o.ageInMonths} , ${o.heightInCM} ]);
		</c:forEach>
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19GirlsSD3}">
					sd3.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19BoysSD3}">
					sd3.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
	    </c:choose>
	    
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19GirlsSD2}">
					sd2.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19BoysSD2}">
					sd2.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
    	</c:choose>
    	
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19GirlsSD1}">
					sd1.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19BoysSD1}">
					sd1.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19GirlsSD0}">
					sd0.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19BoysSD0}">
					sd0.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19GirlsSD1neg}">
					sd1neg.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19BoysSD1neg}">
					sd1neg.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19GirlsSD2neg}">
					sd2neg.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19BoysSD2neg}">
					sd2neg.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>	
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19GirlsSD3neg}">
					sd3neg.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAge5to19BoysSD3neg}">
					sd3neg.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>	
		

		// setup background areas
	    var markingsHeight = [
	        { yaxis: { to: 200 } }
	    ];

		var optionsHeight = {
 			xaxis: {
 				min: 60,
 				max: 229,
 				ticks: [[60, "<b>5 years</b>"], [63, "3"], [66, "6"], [69, "9"], [72, "<b>6 years</b>"], [75, "3"], [78, "6"], [81, "9"], [84, "<b>7 years</b>"], [87, "3"], [90, "6"], [93, "9"], [96, "<b>8 years</b>"], [99, "3"], [102, "6"], [105, "9"], [108, "<b>9 years</b>"], [111, "3"], [114, "6"], [117, "9"], [120, "<b>10 years</b>"], [123, "3"], [126, "6"], [129, "9"], [132, "<b>11 years</b>"], [136, "3"], [139, "6"], [142, "9"], [145, "<b>12 years</b>"], [148, "3"], [151, "6"], [154, "9"], [157, "<b>13 years</b>"], [160, "3"], [163, "6"], [166, "9"], [169, "<b>14 years</b>"], [172, "3"], [175, "6"], [178, "9"], [181, "<b>15 years</b>"], [184, "3"], [187, "6"], [190, "9"], [193, "<b>16 years</b>"], [196, "3"], [199, "6"], [202, "9"], [205, "<b>17 years</b>"], [208, "3"], [211, "6"], [214, "9"], [217, "<b>18 years</b>"], [220, "3"], [223, "6"], [226, "9"], [229, "<b>19 years</b>"]]
 			},
			yaxis: { 
				min: 90, 
				max: 200, 
				ticksSize: [10, ""]
			},
			grid: { markings: markingsHeight },
			points: [{ show: false }, { show: false}, { show: false}, { show: false}, { show: false}, { show: false}, { show: false}, { show: true}],
			lines: { show: true },
			legend: { position: "nw"}
		};

		function plotHeightGraph() {
			var p =$j.plot($j("#obsGraphHeight"), [{ label: "3", color: "#000000", data: sd3 }, { label: "2", color: "#FF0000", data: sd2 }, { label: "1", color: "#FF6600", data: sd1 }, { label: "0", color: "#00FF33", data: sd0 }, { label: "-1", color: "#FF6600", data: sd1neg }, { label: "-2", color: "#FF0000", data: sd2neg }, { label: "-3", color: "#000000", data: sd3neg }, { label: "patient", color: "#0000CC", data: dataHeight } ], optionsHeight);
		}
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.lengthForAge}">
		var dataLength = [];
		var sd3Len = [];
		var sd2Len = [];
		var sd0Len = [];
		var sd2negLen = [];
		var sd3negLen = [];
		
		<c:forEach var="o" items="${formData.obsMapper.lengthForAge}">
			dataLength.push([ ${o.ageInMonths} , ${o.heightInCM} ]);
		</c:forEach>
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAgeFromBirthGirlsSD3}">
					sd3Len.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAgeFromBirthBoysSD3}">
					sd3Len.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
	    </c:choose>
	    
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAgeFromBirthGirlsSD2}">
					sd2Len.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAgeFromBirthBoysSD2}">
					sd2Len.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAgeFromBirthGirlsSD0}">
					sd0Len.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAgeFromBirthBoysSD0}">
					sd0Len.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAgeFromBirthGirlsSD2neg}">
					sd2negLen.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAgeFromBirthBoysSD2neg}">
					sd2negLen.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>	
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAgeFromBirthGirlsSD3neg}">
					sd3negLen.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.heightForAgeFromBirthBoysSD3neg}">
					sd3negLen.push([ ${o.ageInMonths} , ${o.heightInCMDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>

		// setup background areas
	    var markingsLength = [
	        { yaxis: { to: 125 } }
	    ];

		var optionsLength = {
 			xaxis: {
 				min: 0,
 				max: 60,
 				ticks: [[0, "<b>Birth</b>"], [2, "2"], [4, "4"], [6, "6"], [8, "8"], [10, "10"], [12, "<b>1 year</b>"], [14, "2"], [16, "4"], [18, "6"], [20, "8"], [22, "10"], [24, "<b>2 years</b>"], [26, "2"], [28, "4"], [30, "6"], [32, "8"], [34, "10"], [36, "<b>3 years</b>"], [38, "2"], [40, "4"], [42, "6"], [44, "8"], [46, "10"], [48, "<b>4 years</b>"], [50, "2"], [52, "4"], [54, "6"], [56, "8"], [58, "10"], [60, "<b>5 years</b>"]]
	 			},
			yaxis: { 
				min: 40, 
				max: 125, 
				ticks: [[40, ""], [45, "45"], [50, "50"], [55, "55"], [60, "60"], [65, "65"], [70, "70"], [75, "75"], [80, "80"], [85, "85"], [90, "90"], [95, "95"], [100, "100"], [105, "105"], [110, "110"], [115, "115"], [120, "120"], [125, "125"]]
			},
			grid: { markings: markingsLength },
			points: [{ show: false }, { show: false}, { show: false}, { show: false}, { show: false}, { show: true}],
			lines: { show: true },
			legend: { position: "nw"}
		};

		function plotLengthGraph() {
			
			var p =$j.plot($j("#obsGraphLength"), [{ label: "3", color: "#000000", data: sd3Len }, { label: "2", color: "#FF0000", data: sd2Len }, { label: "0", color: "#00FF33", data: sd0Len }, { label: "-2", color: "#FF0000", data: sd2negLen }, { label: "-3", color: "#000000", data: sd3negLen }, { label: "Patient", color: "#0000CC", data: dataLength } ], optionsLength);
		}
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.weightForAgeFromBirth}">
		var dataWeightBirth = [];
		var sd3wb = [];
		var sd2wb = [];
		var sd0wb = [];
		var sd2negwb = [];
		var sd3negwb = [];
		
		<c:forEach var="o" items="${formData.obsMapper.weightForAgeFromBirth}">
			dataWeightBirth.push([ ${o.ageInMonths} , ${o.weightInKG} ]);
		</c:forEach>
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAgeFromBirthGirlsSD3}">
					sd3wb.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAgeFromBirthBoysSD3}">
					sd3wb.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
	    </c:choose>
	    
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAgeFromBirthGirlsSD2}">
					sd2wb.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAgeFromBirthBoysSD2}">
					sd2wb.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAgeFromBirthGirlsSD0}">
					sd0wb.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAgeFromBirthBoysSD0}">
					sd0wb.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAgeFromBirthGirlsSD2neg}">
					sd2negwb.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAgeFromBirthBoysSD2neg}">
					sd2negwb.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>	
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAgeFromBirthGirlsSD3neg}">
					sd3negwb.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAgeFromBirthBoysSD3neg}">
					sd3negwb.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>

		// setup background areas
	    var markingsWeightBirth = [
	        { yaxis: { to: 29 } }
	    ];

		var optionsWeightBirth = {
 			xaxis: {
 				min: 0,
 				max: 60,
 				ticks: [[0, "<b>Birth</b>"], [2, "2"], [4, "4"], [6, "6"], [8, "8"], [10, "10"], [12, "<b>1 year</b>"], [14, "2"], [16, "4"], [18, "6"], [20, "8"], [22, "10"], [24, "<b>2 years</b>"], [26, "2"], [28, "4"], [30, "6"], [32, "8"], [34, "10"], [36, "<b>3 years</b>"], [38, "2"], [40, "4"], [42, "6"], [44, "8"], [46, "10"], [48, "<b>4 years</b>"], [50, "2"], [52, "4"], [54, "6"], [56, "8"], [58, "10"], [60, "<b>5 years</b>"]]
 	 			},
			yaxis: { 
				min: 1, 
				max: 29, 
				ticks: [[2, "2"], [4, "4"], [6, "6"], [8, "8"], [10, "10"], [12, "12"], [14, "14"], [16, "16"], [18, "18"], [20, "20"], [22, "22"], [24, "24"], [26, "26"], [28, "28"]]
			},
			grid: { markings: markingsWeightBirth },
			points: [{ show: false }, { show: false}, { show: false}, { show: false}, { show: false}, { show: true}],
			lines: { show: true },
			legend: { position: "nw"}
		};

		function plotWeightBirthGraph() {
			
			var p =$j.plot($j("#obsGraphWeightBirth"), [ { label: "3", color: "#000000", data: sd3wb }, { label: "2", color: "#FF0000", data: sd2wb }, { label: "0", color: "#00FF33", data: sd0wb }, { label: "-2", color: "#FF0000", data: sd2negwb }, { label: "-3", color: "#FF0000", data: sd3negwb }, { label: "Patient", color: "#0000CC", data: dataWeightBirth }], optionsWeightBirth);
		}
		
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.weightForAge}">
		var dataWeight = [];
		var sd3w = [];
		var sd2w = [];
		var sd1w = [];
		var sd0w = [];
		var sd1negw = [];
		var sd2negw = [];
		var sd3negw = [];
		
		<c:forEach var="o" items="${formData.obsMapper.weightForAge}">
			dataWeight.push([ ${o.ageInMonths} , ${o.weightInKG} ]);
		</c:forEach>
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10GirlsSD3}">
					sd3w.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10BoysSD3}">
					sd3w.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
	    </c:choose>
	    
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10GirlsSD2}">
					sd2w.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10BoysSD2}">
					sd2w.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10GirlsSD1}">
					sd1w.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10BoysSD1}">
					sd1w.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10GirlsSD0}">
					sd0w.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10BoysSD0}">
					sd0w.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10GirlsSD1neg}">
					sd1negw.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10BoysSD1neg}">
					sd1negw.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>	
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10GirlsSD2neg}">
					sd2negw.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10BoysSD2neg}">
					sd2negw.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>	
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10GirlsSD3neg}">
					sd3negw.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForAge5to10BoysSD3neg}">
					sd3negw.push([ ${o.ageInMonths} , ${o.weightInKGDecimal} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>

		// setup background areas
	    var markingsWeight = [
	        { yaxis: { to: 60 } }
	    ];

		var optionsWeight = {
 			xaxis: {
 				min: 60,
 				max: 120,
 				ticks: [[60, "<b>5 years</b>"], [63, "3"], [66, "6"], [69, "9"], [72, "<b>6 years</b>"], [75, "3"], [78, "6"], [81, "9"], [84, "<b>7 years</b>"], [87, "3"], [90, "6"], [93, "9"], [96, "<b>8 years</b>"], [99, "3"], [102, "6"], [105, "9"], [108, "<b>9 years</b>"], [111, "3"], [114, "6"], [117, "9"], [120, "<b>10 years</b>"]]
 			},
			yaxis: { 
				min: 10, 
				max: 60, 
				ticks: [[15, "15"], [20, "20"], [25, "25"], [30, "30"], [35, "35"], [40, "40"], [45, "45"], [50, "50"], [55, "55"]]
			},
			grid: { markings: markingsWeight },
			points: [{ show: false }, { show: false}, { show: false}, { show: false}, { show: false}, { show: false}, { show: false}, { show: true}],
			lines: { show: true },
			legend: { position: "nw"}
		};

		function plotWeightGraph() {
			
			var p =$j.plot($j("#obsGraphWeight"), [{ label: "3", color: "#000000", data: sd3w }, { label: "2", color: "#FF0000", data: sd2w }, { label: "1", color: "#FF6600", data: sd1w }, { label: "0", color: "#00FF33", data: sd0w }, { label: "-1", color: "#FF6600", data: sd1negw }, { label: "-2", color: "#FF0000", data: sd2negw }, { label: "-3", color: "#000000", data: sd3negw }, { label: "Patient", color: "#0000CC", data: dataWeight } ], optionsWeight);
		}
		</c:if>
		
		<c:if test="${formData.patient.age > 15}">
		var dataBMI = [];
		var index = 1;
		<c:forEach var="o" items="${formData.obsMapper.weightObsList}">
			dataBMI.push([ ${o.obsDatetime.time} , ${o.valueNumeric} ]);
		</c:forEach>

	
		// setup background areas
    	var markingsBMI = [
    	   <c:if test="${!empty  formData.obsMapper.latestHeight.valueNumeric}">
			{ color: '#FFD2F2', yaxis: { from: 16 * ${formData.obsMapper.latestHeight.valueNumeric} /100 * ${formData.obsMapper.latestHeight.valueNumeric} /100, to: 18.5 * ${formData.obsMapper.latestHeight.valueNumeric} /100 * ${formData.obsMapper.latestHeight.valueNumeric} /100  } },
	        { color: '#ff6347', yaxis: { to: 16 * ${formData.obsMapper.latestHeight.valueNumeric} /100 * ${formData.obsMapper.latestHeight.valueNumeric} /100  } }
			</c:if>
		];
		

		var optionsBMI = {
				<%= UIHelper.getBMIXAxis(formData) %>,
//				xaxis: { 
//					min: 1,
//					max: 21,
//					ticks: [[1, ""], [2, ""], [3, ""], [4, ""], [5, ""], [6, ""], [7, ""], [8, ""], [9, ""], [10, ""], [11, ""], [12, ""], [13, ""], [14, ""], [15, ""], [16, ""], [17, ""], [18, ""], [19, ""], [20, ""], [21, ""]]
//				},
			yaxis: { 
				min: 20, 
				max: 100, 
				ticks: [[20, ""], [22.5, ""], [25, "25"], [27.5, ""], [30, "30"], [32.5, ""], [35, "35"], [37.5, ""], [40, "40"], [42.5, ""], [45, "45"], [47.5, ""], [50, "50"], [52.5, ""], [55, "55"], [57.5, ""], [60, "60"], [62.5, ""], [65, "65"], [67.5, ""], [70, "70"], [72.5, ""], [75, "75"], [77.5, ""], [80, "80"], [82.5, ""], [85, "85"], [87.5, ""], [90, "90"], [92.5, ""], [95, "95"], [97.5, ""], [100, ""]<c:if test="${!empty  formData.obsMapper.latestHeight.valueNumeric}">, [16 * ${formData.obsMapper.latestHeight.valueNumeric} /100 * ${formData.obsMapper.latestHeight.valueNumeric} /100, "BMI 16&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"], [18.5 * ${formData.obsMapper.latestHeight.valueNumeric} /100 * ${formData.obsMapper.latestHeight.valueNumeric} /100, "BMI 18.5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"]</c:if>]
		},
		grid: { markings: markingsBMI },
		points: { show: true },
		lines: { show: true }
	};

		function plotBMIGraph() {
			var p =$j.plot($j("#bmiGraphGraph"), [{ label: "", data: dataBMI }], optionsBMI);
		}
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.bmiForAge}">
		var dataBMITotal = [];
		var v3negw = [];
		var v2negw = [];
		var v1negw = [];
		var v0w = [];
		var v1w = [];
		var v2w = [];
		var v3w = [];
		
		<c:forEach var="o" items="${formData.obsMapper.bmiForAge}">
			dataBMITotal.push([ ${o.ageInMonths} , ${o.bmi} ]);
		</c:forEach>
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreGirlsSD3neg}">
					v3negw.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreBoysSD3neg}">
					v3negw.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:otherwise>
	    </c:choose>
	    
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreGirlsSD2neg}">
					v2negw.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreBoysSD2neg}">
					v2negw.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreGirlsSD1neg}">
					v1negw.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreBoysSD1neg}">
					v1negw.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreGirlsSD0}">
					v0w.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreBoysSD0}">
					v0w.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreGirlsSD1}">
					v1w.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreBoysSD1}">
					v1w.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>	
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreGirlsSD2}">
					v2w.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreBoysSD2}">
					v2w.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>	
	
		<c:choose>
		  	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreGirlsSD3}">
					v3w.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
		  	</c:when>
		  	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.bmiZScoreBoysSD3}">
					v3w.push([ ${o.ageInMonths} , ${o.bmi} ]);
				</c:forEach>
		  	</c:otherwise>
		</c:choose>	

		// setup background areas
	    var markingsWeightTotal = [
	        { yaxis: { to: 50 }}
	    ];

		var optionsBMIForAgeTotal = {
 			xaxis: { 
				min: 60, 
				max: 180, 
				ticks: [[60, "5"], [72, "6"], [84, "7"], [96, "8"], [108, "9"], [120, "10"], [132, "11"], [144, "12"], [156, "13"], [168, "14"], [180, "15"]]
			},
			yaxis: {
 				min: 0,
 				max: 50,
 				tickSize: 5,
 			},
			grid: { markings: markingsWeightTotal },
			points: [{ show: false }, { show: false}, { show: false}, { show: false}, { show: false}, { show: false}, { show: false}, { show: true}],
			lines: { show: true },
			legend: { position: "nw"}
		};

		function plotBMIForAgeGraph() {
			
			var p =$j.plot($j("#obsGraphBMIForAge"), [{ label: "3", color: "#000000", data: v3w }, { label: "2", color: "#FF0000", data: v2w }, { label: "1", color: "#FF6600", data: v1w }, { label: "0", color: "#00FF33", data: v0w }, { label: "-1", color: "#FF6600", data: v1negw }, { label: "-2", color: "#FF0000", data: v2negw },{ label: "-3", color: "#000000", data: v3negw }, { label: "Patient", color: "#0000CC", data: dataBMITotal }], optionsBMIForAgeTotal);
		}
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.weightForLength}">
		var dataWeightForLength = [];
		var sd3WFL = [];
		var sd2WFL = [];
		var sd0WFL = [];
		var sd2negWFL = [];
		var sd3negWFL = [];
		
		<c:forEach var="o" items="${formData.obsMapper.weightForLength}">
			dataWeightForLength.push([ ${o.weight} , ${o.height} ]);
		</c:forEach>
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForLengthGirlsSD3}">
					sd3WFL.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForLengthBoysSD3}">
					sd3WFL.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:otherwise>
	    </c:choose>
	    
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForLengthGirlsSD2}">
					sd2WFL.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForLengthBoysSD2}">
					sd2WFL.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForLengthGirlsSD0}">
					sd0WFL.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForLengthBoysSD0}">
					sd0WFL.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForLengthGirlsSD2neg}">
					sd2negWFL.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForLengthBoysSD2neg}">
					sd2negWFL.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>	
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForLengthGirlsSD3neg}">
					sd3negWFL.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForLengthBoysSD3neg}">
					sd3negWFL.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>

		// setup background areas
	    var markingsWeightForLength = [
	        { yaxis: { to: 110 } }
	    ];

		var optionsWeightForLength = {
 			xaxis: {
 				min: 0,
 				max: 26,
 				tickSize: 1,
 				},
			yaxis: { 
				min: 40, 
				max: 110, 
				ticks: [[40, ""], [45, "45"], [50, "50"], [55, "55"], [60, "60"], [65, "65"], [70, "70"], [75, "75"], [80, "80"], [85, "85"], [90, "90"], [95, "95"], [100, "100"], [105, "105"], [110, "110"]]
			},
			grid: { markings: markingsWeightForLength },
			points: [{ show: false }, { show: false}, { show: false}, { show: false}, { show: false}, { show: true}],
			lines: { show: true },
			legend: { position: "nw"}
		};

		function plotWeightForLengthGraph() {
			
			var p =$j.plot($j("#obsGraphWeightForLength"), [{ label: "3", color: "#FF0000", data: sd3WFL }, { label: "2", color: "#FF6600", data: sd2WFL }, { label: "0", color: "#00FF33", data: sd0WFL }, { label: "-2", color: "#CC6600", data: sd2negWFL }, { label: "-3", color: "#CC0000", data: sd3negWFL }, { label: "Patient", color: "#0000CC", data: dataWeightForLength } ], optionsWeightForLength);
		}
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.weightForHeight}">
		var dataWeightForHeight = [];
		var sd3WFH = [];
		var sd2WFH = [];
		var sd0WFH = [];
		var sd2negWFH = [];
		var sd3negWFH = [];
		
		<c:forEach var="o" items="${formData.obsMapper.weightForHeight}">
			dataWeightForHeight.push([ ${o.weight} , ${o.height} ]);
		</c:forEach>
		
		<c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForHeightGirlsSD3}">
					sd3WFH.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForHeightBoysSD3}">
					sd3WFH.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:otherwise>
	    </c:choose>
	    
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForHeightGirlsSD2}">
					sd2WFH.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForHeightBoysSD2}">
					sd2WFH.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForHeightGirlsSD0}">
					sd0WFH.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForHeightBoysSD0}">
					sd0WFH.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForHeightGirlsSD2neg}">
					sd2negWFH.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForHeightBoysSD2neg}">
					sd2negWFH.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>	
		
	    <c:choose>
	      	<c:when test="${formData.gender == 'F'}">
		      	<c:forEach var="o" items="${formData.whoMapping.weightForHeightGirlsSD3neg}">
					sd3negWFH.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:when>
	      	<c:otherwise>
		      	<c:forEach var="o" items="${formData.whoMapping.weightForHeightBoysSD3neg}">
					sd3negWFH.push([ ${o.weight} , ${o.height} ]);
				</c:forEach>
	      	</c:otherwise>
		</c:choose>

		// setup background areas
	    var markingsWeightForHeight = [
	        { yaxis: { to: 120 } }
	    ];

		var optionsWeightForHeight = {
 			xaxis: {
 				min: 5,
 				max: 34,
 				tickSize: 1,
 				},
			yaxis: { 
				min: 65, 
				max: 120, 
				ticks: [[65, "65"], [70, "70"], [75, "75"], [80, "80"], [85, "85"], [90, "90"], [95, "95"], [100, "100"], [105, "105"], [110, "110"], [115, "115"], [120, "120"]]
			},
			grid: { markings: markingsWeightForHeight },
			points: [{ show: false }, { show: false}, { show: false}, { show: false}, { show: false}, { show: true}],
			lines: { show: true },
			legend: { position: "nw"}
		};

		function plotWeightForHeightGraph() {
			
			var p =$j.plot($j("#obsGraphWeightForHeight"), [{ label: "3", color: "#FF0000", data: sd3WFH }, { label: "2", color: "#FF6600", data: sd2WFH }, { label: "0", color: "#00FF33", data: sd0WFH }, { label: "-2", color: "#CC6600", data: sd2negWFH }, { label: "-3", color: "#CC0000", data: sd3negWFH }, { label: "Patient", color: "#0000CC", data: dataWeightForHeight } ], optionsWeightForHeight);
		}
		</c:if>

		function loadGraphs() {
			$j("#graphs").removeClass('ui-tabs-hide');
			<c:if test="${!empty formData.obsMapper.heightForAge}">
			plotHeightGraph();
			</c:if>
			<c:if test="${!empty formData.obsMapper.lengthForAge}">
			plotLengthGraph();
			</c:if>
			<c:if test="${!empty formData.obsMapper.weightForAgeFromBirth}">
			plotWeightBirthGraph();
			</c:if>
			<c:if test="${!empty formData.obsMapper.weightForAge}">
			plotWeightGraph();
			</c:if>
			<c:if test="${formData.patient.age > 15}">
			plotBMIGraph();
			</c:if>
			<c:if test="${!empty formData.obsMapper.bmiForAge}">
			plotBMIForAgeGraph();
			</c:if>
			<c:if test="${!empty formData.obsMapper.weightForLength}">
			plotWeightForLengthGraph();
			</c:if>
			<c:if test="${!empty formData.obsMapper.weightForHeight}">
			plotWeightForHeightGraph();
			</c:if>
			$j("#graphs").addClass('ui-tabs-hide');					
		}

		window.setTimeout(loadGraphs, 1000);
</script>

<span class="view-row"><a href="javascript:window.print()"><strong>Print Growth Chart</strong></a></span>
<div id="form-header-section">
	<div class="form-header">Growth Chart</div>
</div>



<div id="visits"> <!-- RESUME DES VISITES -->
		<span class="form-header">RESUME DES MESURES</span>
		<table class="section-table">
			<thead>
				<tr>
					<th class="section-emr">EMR</th>
					<th scope="col" class="view-row">View</th>
					<th>Date de mesures</th>
					<th>Age</th>
					<th>Poids</th>
					
					<th>Taille</th>
					<th colspan="2">Z-score</th>
					<th>Poids pour taille</th>
					<th>BMI pour age</th>
					<th>BMI</th>
				</tr>
				<tr>
					<th scope="col" id="col-visits-1" class="section-emr"></th>
					<th scope="col" id="col-visits-view" class="view-row">&nbsp;</th>
					<th scope="col" id="col-visits-2">jj/mm/aaaa</th>
					<th scope="col" id="col-visits-3"></th>
					<th scope="col" id="col-visits-4">(kg)</th>
					
					<th scope="col" id="col-visits-5">(cm)</th>
					<th scope="col" id="col-visits-6" colspan="2">(mettre dans les courbes en-dessous)</th>
					<th scope="col" id="col-visits-7">(%)</th>
					<th scope="col" id="col-visits-8">(z-score)</th>
					<th scope="col" id="col-visits-9"></th>
				</tr>
				<tr>
					<th scope="col" ></th>
					<th scope="col" ></th>
					<th scope="col" ></th>
					<th scope="col" ></th>
					<th scope="col" ></th>
					

					<th scope="col" >Taille pour age</th>
					<th scope="col" >Poids pour age</th>
					<th scope="col" ></th>
					<th scope="col" ></th>
					<th scope="col" ></th>
				</tr>
			</thead>
			<tfoot>
			</tfoot>
			<tbody>
				<c:forEach var="visitRow" items="${formData.obsMapper.visitsPediShortList}">
					<jsp:useBean id="visitRow" type="org.openmrs.module.heightweighttracker.mapper.VisitGroup" />
					<tr <c:if test="${not visitRow.emr}">class="empty-row"</c:if>>
						<td class="section-emr"><c:if test="${visitRow.emr}">&#x2713;</c:if></td>
						<td class="view-row" align="center">
							<c:if test="${visitRow.encounter != null}">
							<c:set var="viewEncounterUrl" value="${pageContext.request.contextPath}/module/htmlformentry/htmlFormEntry.form?encounterId=${visitRow.encounter.encounterId}&formId=${Form_NewVisit}&mode=EDIT"/>
							<a href="javascript:void(0)" onClick="loadUrlIntoEncounterPopup('<openmrs:format encounter="${visitRow.encounter}"/>', '${viewEncounterUrl}', true); return false;">
								<img src="${pageContext.request.contextPath}/images/file.gif" title="<spring:message code="general.view"/>" border="0" align="top" />
							</a>
							</c:if>
						</td>
						<jsp:useBean id="now" class="java.util.Date"/>

						<c:if test="${visitRow.date eq now}">
						<span class="today">
						</c:if>
						<td><span class="value-date"><c:choose><c:when test="${visitRow.emr}"><openmrs:formatDate date="${visitRow.date}" format="${FormatDate_General}"/></c:when><c:otherwise>${DateTextPlaceHolder}</c:otherwise></c:choose></span></td>
						<td><span class="value-data"><c:if test="${visitRow.age > -1}"><c:out value="${visitRow.age}"/></c:if></span>
						<td><span class="value-data"><openmrs:format obsValue="${visitRow.weight}"/></span></td>
						<td><span class="value-data"><openmrs:format obsValue="${visitRow.height}"/></span></td>
						<td><c:choose><c:when test="${visitRow.ZScoreHeight != null}"><span class="value-data"><openmrs:format obsValue="${visitRow.ZScoreHeight}"/></span></c:when>
						    		  <c:otherwise><span class="value-calculated"><c:out value="${visitRow.calculatedZScoreHeight}"/></span></c:otherwise>
						    </c:choose>
						</td>
						<td><c:choose><c:when test="${visitRow.ZScoreWeight != null}"><span class="value-data"><openmrs:format obsValue="${visitRow.ZScoreWeight}"/></span></c:when>
						    		  <c:otherwise><span class="value-calculated"><c:out value="${visitRow.calculatedZScoreWeight}"/></span></c:otherwise>
						    </c:choose>
						</td>
						<td><c:choose><c:when test="${visitRow.heightWeightPercentile != null}"><span class="value-data"><openmrs:format obsValue="${visitRow.heightWeightPercentile}"/></span></c:when>
						    		  <c:otherwise><span class="value-calculated"><c:out value="${visitRow.calculatedHeightWeightPercentile}"/></span></c:otherwise>
						    </c:choose>
						</td>
						<td><c:choose><c:when test="${visitRow.ZScoreBmi != null}"><span class="value-data"><openmrs:format obsValue="${visitRow.ZScoreBmi}"/></span></c:when>
						    		  <c:otherwise><span class="value-calculated"><c:out value="${visitRow.calculatedBmiForAge}"/></span></c:otherwise>
						    </c:choose>
						</td>
						<td><c:choose><c:when test="${visitRow.bmi != null}"><span class="value-data"><openmrs:format obsValue="${visitRow.bmi}"/></span></c:when>
						    		  <c:otherwise><span class="value-calculated"><c:out value="${visitRow.calculatedBmi}"/></span></c:otherwise>
						    </c:choose>
						</td>
						<c:if test="${visitRow.date eq now}">
							</span>
						</c:if>
					</tr>
				</c:forEach>
				<tr class="new-item-button-row">
					<td colspan="16">
						<center><button onClick="showEntryPopup('New Visit', ${formData.visitFormId}); return false;">Ajoutez les nouvelles données</button></center>
					</td>
				</tr>
			</tbody>
		</table>
</div>



<div id="graphs" class="graphs">

		<c:if test="${formData.patient.age > 15}">
		<div style="page-break-before: always" id="bmiGraph"> <!-- Courbe d’évolution du BMI -->
 		<table border="0" cellspacing="0">
 			<tr>
 				<td>
			<table border="1" cellspacing="0" class="bmiLegend">
				<tr>
					<th>
						BMI<br/>
						(kg/m<sup style="font-size: 6px">2</sup>)
					</th>
					<th colspan="2">
						= <u style="font-size: 6px">poids en kilogrammes</u><br/>
						&nbsp;&nbsp;&nbsp;Taille en metres<sup style="font-size: 6px">2</sup>
					</th>
				</tr>
				<tr>
					<th>
					</th>
					<th colspan="2">
						BMI
					</th>
				</tr>
				<tr>
					<td></td><td>16</td><td>18.5</td>
				</tr>
				<tr>
					<td>Taille (cm)</td><td colspan="2">Poids en Kg</td>
				</tr>
				<TR>
					<TD>140</TD>
					<TD>31</TD>
					<TD>36</TD>
				</TR>
				<TR>
					<TD>141</TD>
					<TD>32</TD>
					<TD>37</TD>
				</TR>
				<TR>
					<TD>142</TD>
					<TD>32</TD>
					<TD>37</TD>
				</TR>
				<TR>
					<TD>143</TD>
					<TD>33</TD>
					<TD>38</TD>
				</TR>
				<TR>
					<TD>144</TD>
					<TD>33</TD>
					<TD>38</TD>
				</TR>
				<TR>
					<TD>145</TD>
					<TD>34</TD>
					<TD>39</TD>
				</TR>
				<TR>
					<TD>146</TD>
					<TD>34</TD>
					<TD>39</TD>
				</TR>
				<TR>
					<TD>147</TD>
					<TD>35</TD>
					<TD>40</TD>
				</TR>
				<TR>
					<TD>148</TD>
					<TD>35</TD>
					<TD>41</TD>
				</TR>
				<TR>
					<TD>149</TD>
					<TD>36</TD>
					<TD>41</TD>
				</TR>
				<TR>
					<TD>150</TD>
					<TD>36</TD>
					<TD>42</TD>
				</TR>
				<TR>
					<TD>151</TD>
					<TD>36</TD>
					<TD>42</TD>
				</TR>
				<TR>
					<TD>152</TD>
					<TD>37</TD>
					<TD>43</TD>
				</TR>
				<TR>
					<TD>153</TD>
					<TD>37</TD>
					<TD>43</TD>
				</TR>
				<TR>
					<TD>154</TD>
					<TD>38</TD>
					<TD>44</TD>
				</TR>
				<TR>
					<TD>155</TD>
					<TD>38</TD>
					<TD>44</TD>
				</TR>
				<TR>
					<TD>156</TD>
					<TD>39</TD>
					<TD>45</TD>
				</TR>
				<TR>
					<TD>157</TD>
					<TD>39</TD>
					<TD>46</TD>
				</TR>
				<TR>
					<TD>158</TD>
					<TD>40</TD>
					<TD>46</TD>
				</TR>
				<TR>
					<TD>159</TD>
					<TD>40</TD>
					<TD>47</TD>
				</TR>
				<TR>
					<TD>160</TD>
					<TD>41</TD>
					<TD>47</TD>
				</TR>
				<TR>
					<TD>161</TD>
					<TD>41</TD>
					<TD>48</TD>
				</TR>
				<TR>
					<TD>162</TD>
					<TD>42</TD>
					<TD>49</TD>
				</TR>
				<TR>
					<TD>163</TD>
					<TD>43</TD>
					<TD>49</TD>
				</TR>
				<TR>
					<TD>164</TD>
					<TD>43</TD>
					<TD>50</TD>
				</TR>
				<TR>
					<TD>165</TD>
					<TD>44</TD>
					<TD>50</TD>
				</TR>
				<TR>
					<TD>166</TD>
					<TD>44</TD>
					<TD>51</TD>
				</TR>
				<TR>
					<TD>167</TD>
					<TD>45</TD>
					<TD>52</TD>
				</TR>
				<TR>
					<TD>168</TD>
					<TD>45</TD>
					<TD>52</TD>
				</TR>
				<TR>
					<TD>169</TD>
					<TD>46</TD>
					<TD>53</TD>
				</TR>
				<TR>
					<TD>170</TD>
					<TD>46</TD>
					<TD>53</TD>
				</TR>
				<TR>
					<TD>171</TD>
					<TD>47</TD>
					<TD>54</TD>
				</TR>
				<TR>
					<TD>172</TD>
					<TD>47</TD>
					<TD>55</TD>
				</TR>
				<TR>
					<TD>173</TD>
					<TD>48</TD>
					<TD>55</TD>
				</TR>
				<TR>
					<TD>174</TD>
					<TD>48</TD>
					<TD>56</TD>
				</TR>
				<TR>
					<TD>175</TD>
					<TD>49</TD>
					<TD>57</TD>
				</TR>
				<TR>
					<TD>176</TD>
					<TD>50</TD>
					<TD>57</TD>
				</TR>
				<TR>
					<TD>177</TD>
					<TD>50</TD>
					<TD>58</TD>
				</TR>
				<TR>
					<TD>178</TD>
					<TD>51</TD>
					<TD>59</TD>
				</TR>
				<TR>
					<TD>179</TD>
					<TD>51</TD>
					<TD>59</TD>
				</TR>
				<TR>
					<TD>180</TD>
					<TD>52</TD>
					<TD>60</TD>
				</TR>
				<TR>
					<TD>181</TD>
					<TD>52</TD>
					<TD>61</TD>
				</TR>
				<TR>
					<TD>182</TD>
					<TD>53</TD>
					<TD>61</TD>
				</TR>
				<TR>
					<TD>183</TD>
					<TD>54</TD>
					<TD>62</TD>
				</TR>
				<TR>
					<TD>184</TD>
					<TD>54</TD>
					<TD>63</TD>
				</TR>
				<TR>
					<TD>185</TD>
					<TD>55</TD>
					<TD>63</TD>
				</TR>
				<TR>
					<TD>186</TD>
					<TD>55</TD>
					<TD>64</TD>
				</TR>
				<TR>
					<TD>187</TD>
					<TD>56</TD>
					<TD>65</TD>
				</TR>
				<TR>
					<TD>188</TD>
					<TD>57</TD>
					<TD>65</TD>
				</TR>
				<TR>
					<TD>189</TD>
					<TD>57</TD>
					<TD>66</TD>
				</TR>
				<TR>
					<TD>190</TD>
					<TD>58</TD>
					<TD>67</TD>
				</TR>
				<TR>
					<TD>191</TD>
					<TD>58</TD>
					<TD>67</TD>
				</TR>
				<TR>
					<TD>192</TD>
					<TD>59</TD>
					<TD>68</TD>
				</TR>
				<TR>
					<TD>193</TD>
					<TD>60</TD>
					<TD>69</TD>
				</TR>
				<TR>
					<TD>194</TD>
					<TD>60</TD>
					<TD>70</TD>
				</TR>
				<TR>
					<TD>195</TD>
					<TD>61</TD>
					<TD>70</TD>
				</TR>
				<TR>
					<TD>196</TD>
					<TD>61</TD>
					<TD>71</TD>
				</TR>
				<TR>
					<TD>197</TD>
					<TD>62</TD>
					<TD>72</TD>
				</TR>
				<TR>
					<TD>198</TD>
					<TD>63</TD>
					<TD>73</TD>
				</TR>
				<TR>
					<TD>199</TD>
					<TD>63</TD>
					<TD>73</TD>
				</TR>
				<TR>
					<TD>200</TD>
					<TD>64</TD>
					<TD>74</TD>
				</TR>
			</table>
			</td>
			<td>
			<table class="section-graph">
				<tr>
						<td>
							<table class="section-graph">
								<thead>
									<tr>
										<th align="left" width="5%"></th>				
										<th width="99%"><center><u>Courbe d’évolution du BMI</u>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Taille <u>&nbsp;&nbsp;&nbsp;<openmrs:format obsValue="${formData.obsMapper.latestHeight}"/>&nbsp;&nbsp;&nbsp;</u> cm</center></th>
										<th></th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Poids (kg)</td>										
										<td>
											<div id="bmiGraphGraph" class="bmiGraph"></div>
										</td>
										<td></td>
									</tr>
									<tr>
									<td></td><td>Date (jj/mm/aaaa)</td><td></td>
								</tbody>
							</table>
						</td>
				</tr>
			</table>
			</td>
			</tr>
		</table>
	</div>
	</c:if>
	
		<c:if test="${!empty formData.obsMapper.bmiForAge}">
		<div style="page-break-before: always" id="bmiForAge"> 
		<h1>
			<c:if test="${formData.gender == 'F'}">
				BMI-for-age GIRLS
			</c:if>

			<c:if test="${formData.gender == 'M'}">
				BMI-for-age BOYS	
			</c:if>
		</h1>
		<hr />
		<b>5 to 15 years(z-scores)</b>
		<table class="section-graph">
			<tbody>
				<tr>
					<td align="left">BMI</td>	
					<td align="center">
						<div id="obsGraphBMIForAge" class="bmiForAge"></div>
					</td>
				</tr>
				<tr>
					<td></td>
					<td align="center">
						Age(completed months and years)
					</td>
				</tr>
			</tbody>
		</table>
		</div>
		<div style="height: 10px"></div>
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.heightForAge}">
		<div style="page-break-before: always" id="heightForAge"> 
		<h1>
			<c:if test="${formData.gender == 'F'}">
				Height-for-age GIRLS
			</c:if>

			<c:if test="${formData.gender == 'M'}">
				Height-for-age BOYS	
			</c:if>
		</h1>
		<hr />
		<b>5 to 19 years(z-scores)</b>
		<table class="section-graph">
			<tbody>
				<tr>
					<td align="left">Height (cm)</td>	
					<td align="center">
						<div id="obsGraphHeight" class="heightForAge"></div>
					</td>
				</tr>
				<tr>
					<td></td>
					<td align="center">
						Age(completed months and years)
					</td>
				</tr>
			</tbody>
		</table>
		</div>
		<div style="height: 10px"></div>
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.weightForAge}">
		<div style="page-break-before: always" id="weightForAge"> 
		<h1>
			<c:if test="${formData.gender == 'F'}">
				Weight-for-age GIRLS
			</c:if>

			<c:if test="${formData.gender == 'M'}">
				Weight-for-age BOYS	
			</c:if>
		</h1>
		<hr />
		<b>5 to 10 years(z-scores)</b>
		<table class="section-graph">
			<tbody>
				<tr>
					<td align="left">Weight (kg)</td>	
					<td align="center">
						<div id="obsGraphWeight" class="weightForAge"></div>
					</td>
				</tr>
				<tr>
					<td></td>
					<td align="center">
						Age(completed months and years)
					</td>
				</tr>
			</tbody>
		</table>
		</div>
		<div style="height: 10px"></div>
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.weightForHeight}">
		<div style="page-break-before: always" id="weightForHeight"> 
		<h1>
			<c:if test="${formData.gender == 'F'}">
				Weight for Height GIRLS
			</c:if>

			<c:if test="${formData.gender == 'M'}">
				Weight for Height BOYS	
			</c:if>
		</h1>
		<hr />
		<b>2 to 5 years(z-scores)</b>
		<table class="section-graph">
			<tbody>
				<tr>
					<td align="left">Height (cm)</td>	
					<td align="center">
						<div id="obsGraphWeightForHeight" class="lengthForAge"></div>
					</td>
				</tr>
				<tr>
					<td></td>
					<td align="center">
						Weight (kg)
					</td>
				</tr>
			</tbody>
		</table>
		</div>
		<div style="height: 10px"></div>
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.weightForLength}">
		<div style="page-break-before: always" id="weightForLength"> 
		<h1>
			<c:if test="${formData.gender == 'F'}">
				Weight for Length GIRLS
			</c:if>

			<c:if test="${formData.gender == 'M'}">
				Weight for Length BOYS	
			</c:if>
		</h1>
		<hr />
		<b>0 to 2 years(z-scores)</b>
		<table class="section-graph">
			<tbody>
				<tr>
					<td align="left">Height (cm)</td>	
					<td align="center">
						<div id="obsGraphWeightForLength" class="lengthForAge"></div>
					</td>
				</tr>
				<tr>
					<td></td>
					<td align="center">
						Weight (kg)
					</td>
				</tr>
			</tbody>
		</table>
		</div>
		<div style="height: 10px"></div>
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.lengthForAge}">
		<div style="page-break-before: always" id="lengthForAge"> 
		<h1>
			<c:if test="${formData.gender == 'F'}">
				Length/height-for-age GIRLS
			</c:if>

			<c:if test="${formData.gender == 'M'}">
				Length/height-for-age BOYS	
			</c:if>
		</h1>
		<hr />
		<b>Birth to 5 years(z-scores)</b>
		<table class="section-graph">
			<tbody>
				<tr>
					<td align="left">Length/<br />Height (cm)</td>	
					<td align="center">
						<div id="obsGraphLength" class="lengthForAge"></div>
					</td>
				</tr>
				<tr>
					<td></td>
					<td align="center">
						Age(completed months and years)
					</td>
				</tr>
			</tbody>
		</table>
		</div>
		<div style="height: 10px"></div>
		</c:if>
		
		<c:if test="${!empty formData.obsMapper.weightForAgeFromBirth}">
		<div style="page-break-before: always" id="weightForAgeBirth"> 
		<h1>
			<c:if test="${formData.gender == 'F'}">
				Weight-for-age GIRLS
			</c:if>

			<c:if test="${formData.gender == 'M'}">
				Weight-for-age BOYS	
			</c:if>
		</h1>
		<hr />
		<b>Birth to 5 years(z-scores)</b>
		<table class="section-graph">
			<tbody>
				<tr>
					<td align="left">Weight (kg)</td>	
					<td align="center">
						<div id="obsGraphWeightBirth" class="weightForAgeBirth"></div>
					</td>
				</tr>
				<tr>
					<td></td>
					<td align="center">
						Age(completed months and years)
					</td>
				</tr>
			</tbody>
		</table>
		</div>
		<div style="height: 10px"></div>
		</c:if>
</div>

<%@ include file="templates/footer.jsp"%>
