/**
 * showPage.js
 */
function showPage() {
	let doc = xhtp.responseXML;
	console.log(doc);
	let data = doc.getElementsByTagName('record');
	console.log(data);
	let tableTag = document.createElement('table');
	tableTag.setAttribute('border', '1');
	//trTag.createElement('tr');

	//title tr
	//data tr => [배열]
	let headerTr = titleRow(data);
	let dataTr = contentRow(data);
	tableTag.appendChild(headerTr);
	for (let i=   0;  i<  dataTr.length; i++) {
		tableTag.appendChild(dataTr[i]);
	}
	document.getElementById('show').appendChild(tableTag);
}

function titleRow(result) {
	//console.log(result[0].childNodes[3].nodeName);; // 타이틀로우 출력시 어떤값이 들어오는지 확인
	let trTag = document.createElement('tr');
	for (let  i = 0;  i<  result[0].childNodes.length; i++) {
		let thTag = document.createElement('th');
		let textNode = document.createTextNode(result[0].childNodes[i].nodeName.toUpperCase());
		thTag.appendChild(textNode);
		trTag.appendChild(thTag);
	}

	let tdTag = document.createElement('th');
	let textNode = document.createTextNode('처리');
	tdTag.appendChild(textNode);
	trTag.appendChild(tdTag);

	trTag.onmouseover = function() {
		trTag.style.backgroundColor = 'green';
	}
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
		//임의 버튼 추가 
		let button = document.createElement('button');
		button.innerHTML = '삭제';
		button.onclick = function() {
			console.log(this.parentNode.parentNode.remove());
            let id = this.parentNode.parentNode.childNodes[0].firstChild.nodeValue;
            let req = new XMLHttpRequest();
            req.open('get', '../deleteEmp?empId=' + id);
            req.send();
            req.onload = function () {
                console.log(req.responseText);
            }
        }
		button.onmouseover = function() {
			button.style.backgroundColor = 'red';
		} //펑션을 밖에 있어서 빼줘야한다 안에넣으면 delete 같이 실행되어 날라감. 주의.

		trTag.onmouseover = function() {
			trTag.style.backgroundColor = 'yellow';
		}  //열었으면 닫기..
		let tdTag = document.createElement('td');
		tdTag.appendChild(button);
		trTag.appendChild(tdTag);

		trTags.push(trTag);
	}
	return trTags;
}












