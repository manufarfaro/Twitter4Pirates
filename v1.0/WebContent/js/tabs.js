// JavaScript Document
$(document).ready(function() {

	//Default Action
	$(".tab_content").hide(); //Hide all content
	$("ul.tabs li:first").addClass("active").show(); //Activate first tab
	$(".tab_content:first").show(); //Show first tab content
	
	//On Click Event
	$("ul.tabs li").click(function() {
		$("ul.tabs li").removeClass("active"); //Remove any "active" class
		$(this).addClass("active"); //Add "active" class to selected tab
		$(".tab_content").hide(); //Hide all tab content
		var activeTab = $(this).find("a").attr("href"); //Find the rel attribute value to identify the active tab + content
		$(activeTab).fadeIn(); //Fade in the active content
		return false;
	});


	//Default Sub_Action
	$(".sub_tab_content").hide(); //Hide all content
	$("ul.sub_tabs li:first").addClass("active").show(); //Activate first tab
	/*$(".sub_tab_content:first").show(); //Show first tab content*/
	
	//On Click Event
	$("ul.sub_tabs li").click(function() {
		$("ul.sub_tabs li").removeClass("active"); //Remove any "active" class
		$(this).addClass("active"); //Add "active" class to selected tab
		$(".sub_tab_content").hide(); //Hide all tab content
		var subactiveTab = $(this).find("a").attr("href"); //Find the rel attribute value to identify the active tab + content
		$(subactiveTab).fadeIn(); //Fade in the active content
		return false;
	});
});