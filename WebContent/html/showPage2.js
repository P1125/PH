
/**
 * showPage2.js
 */
function showPage() {
	let doc = xhtp.responseXML;
	console.log(doc);
	let data = doc.getElementsByTagName('record');
	console.log(data);
	let tableTag = document.createElement('table');
	tableTag.setAttribute('border', '1');
	tableTag.setAttribute('id', 'tbl');
	//trTag.createElement('tr');

	//title tr 
	//data tr => [배열]
	let headerTr = titleRow(data);
	let dataTrs = contentRow(data);
	tableTag.appendChild(headerTr);
	for (let i=0;  i<dataTrs.length; i++) {
		tableTag.appendChild(addBtn(dataTrs[i], delFunc,'삭제')); // 변수이름 2개를넣든3개를넣든 맞춰줘야한다.
	}
	document.getElementById('show').appendChild(tableTag);
} // 여기까지가 메인 밑에함수 만들어 집어넣음.


function delFunc(){
	console.log(this.parentNode.parentNode.remove());
	let id = this.parentNode.parentNode.childNodes[0].firstChild.nodeValue;
	let del = new XMLHttpRequest();
	del.open('get','../deleteEmp?empId=' + id);
	del.send();
	
	del.onload = function(){  // 언로드에다 콜백함수정의
		console.log(del.responseText);
	}
	
	
}


function addBtn(tr, callBackFunc, name){
	//버튼 추가 코드. 이벤트 등록
	let butn = document.createElement('button');
	butn.onclick = callBackFunc;
	butn.innerHTML = name;
	let tdTag = document.createElement('td');
	tdTag.appendChild(butn);
	tr.appendChild(tdTag);
	
	butn.onmouseover = function() {
		butn.style.backgroundColor = 'yellow';
		}; //변수이름이 trTag가아니라 butn이다  
	return tr;
}



function titleRow(result) {
	console.log(result[0].childNodes[3].nodeName);; // 타이틀로우 출력시 어떤값이 들어오는지 확인
	let trTag = document.createElement('tr');
	for (let  i = 0;  i<  result[0].childNodes.length; i++) {
		let thTag = document.createElement('th');
		let textNode = document.createTextNode(result[0].childNodes[i].nodeName.toUpperCase());
		thTag.appendChild(textNode);
		trTag.appendChild(thTag);
	}
	trTag.onmouseover = function() {
		trTag.style.backgroundColor = 'green';
	};
	return trTag;
}
function contentRow(result) { 
	let trTags = []; 
	for (let j = 0;  j<  result.length; j++)  {
		let trTag = document.createElement('tr');
		for (let i=   0; i < result[0].childNodes.length; i++) {
			let tdTag = document.createElement('td');
			let textNode = document.createTextNode(result[j].childNodes[i].firstChild.nodeValue);  // resulsms record값 1,2,3 하위의 childeNode 0번째 1번째 등 칼럼이름 
			tdTag.appendChild(textNode);
			trTag.appendChild(tdTag);
		}
		trTag.onmouseover = function() {
		trTag.style.backgroundColor = 'red';
		};
		trTag.onmouseout = function() {
		trTag.style.backgroundColor = 'grey';
		}
	trTags.push(trTag);
		}
	return trTags;
}



