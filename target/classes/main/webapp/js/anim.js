// Copyright Lukáš Mikulič, Jakub Mikuláštík 2015 - All rights reserved
// No copy, edit or commercial use allowed

var otvorit, zavri, sipka, tab;
function table_move(){
	otvorit = document.getElementById('table_slide');
	zavri = document.getElementById('xxx');
	sipka = document.getElementById('arrow');
	tab = document.getElementById('tabulka');
	
	otvorit.style.width = "1000px";
	zavri.style.right = "1000px";
	sipka.style.display = "none";
	tab.style.display = "block";
};

function table_hide(){
	otvorit = document.getElementById('table_slide');
	zavri = document.getElementById('xxx');
	sipka = document.getElementById('arrow');
	tab = document.getElementById('tabulka');
	
	otvorit.style.width = "50px";
	zavri.style.right = "0px";
	sipka.style.display = "block";
	tab.style.display = "none";
	
};
// JavaScript Document