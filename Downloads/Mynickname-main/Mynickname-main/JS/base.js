function LoadNAVBAR(){
    const allElements=document.getElementsByTagName('*');
    for(var i=0;i<allElements.length;i++){
        var el= allElements[i];
        var navpath=el.getAttribute("nav-include-path");
        if(navpath){
            var xhttp=new XMLHttpRequest(); //xhttp 객체생성. XMLHttpRequest이 이미 있는 것이기 때문.
            xhttp.onreadystatechange = function () {
                if(this.readyState==4 && this.status==200){
                    el.innerHTML = xhttp.responseText; //내부의 모든 html파일에 접근
                    el.removeAttribute("nav-include-path");
                    LoadNAVBAR();
                }
            }
            xhttp.open("GET",navpath,true); //get:리소스 요청. 접근 url, true(이건 기본값)
            xhttp.send();
            return 0;//반환값이 없으므로 return만 적어준다.
        }
    }
}

function LoadFooterbar(){ //LoadFooterbar 함수 정의
    const FootElements = document.getElementsByTagName('*');
    /* FootElements에 document의 getElementsByTagName 메소드를 이용하여 문서의 모든 요소에 접근. const로 선언했으므로 Footelements의 값은 변하지 않는다.*/
    for(var i=0;i<FootElements.length;i++){ //var을 통해 i를 선언하고, FootElements의 길이보다 작으면 i를 증가시키면 계속 실행
        var AryFootElements = FootElements[i]; //AryFootElements에 FootElements의 0번째 요소부터 계속 할당
        var footerpath = AryFootElements.getAttribute("foot-include-path");
        /* footerpath 변수에 foot-include-path라는 경로 속성 할당. AryFootElements의 속성 접근 메소드 getAttribute를 이용하여 할당한다.
        이때 AryFootElements를 문서의 요소를 할당하는 요소(DOM)로 선언했는데, 이에 따라 JS 인터페이스가 자동으로 몇 가지 메소드를 할당한다.
        이에 따라 AryFootElements 인스턴스는 getAttribute라는 메소드를 가지게 된다.
         */
        if(footerpath){ /*footerpath 경로가 정상적으로 실행된다면,(진리성을 가진다면) 아래 코드 실행. JS에서는 자동적으로 진리값을 검산할 수 있으므로
            자동적으로 코드를 실행할 것인지 아닌지 판단 가능*/
            var link=new XMLHttpRequest(); /*XMLHttpRequest 객체 내에서 link라는 인스턴스 생성.
            XMLHttpRequest의 메소드는 인스턴스로만 접근할 수 있기 때문에 인스턴스를 생성해준다. */
            link.onreadystatechange = function (){ /*XMLHttpRequest의 이벤트 속성인 onreadystatechange(객체가 변할 때마다 호출할 함수)
            를 인스턴스를 통해 선언한다. 즉, 객체가 변하면 아래 함수문을 호출하여 반복한다.*/
                if(link.status==200 && link.readyState==4){ /* link.status는 HTTP응답 상태를 나타내준다. 200이면 성공적으로 불러옴을 나타내고, 404일 시 실패함을 나타낸다.
                둘째로, link.readyState는 객체 XMLHttpRequest의 상태를 0~4까지의 숫자로 나타내는데, 숫자 4는 요청이 성공적으로 완료된 상태임을 나타낸다.*/
                    AryFootElements.innerHTML=link.responseText; /* AryFootElements의 메소드 innerHTML은 HTML파일 내부에 접근하여 요소들을 불러온다.
                    이 경우 foot-include-path경로 상에 나타내어진 footerpath의 요소들이 되며, 이것을 link의 메소드 responseText를 통해
                    텍스트 데이터로 변환하여 표시한다.*/
                    AryFootElements.removeAttribute("foot-include-path"); //AryFootElements에서 접근한 경로 속성을 제거한다.
                    LoadFooterbar(); //위의 조건들이 맞다면 LoadFooterbar()를 실행시킨다.
                }
            }
            link.open("GET",footerpath,true); /*.open메소드로 서버로 보낼 HTTP 요청 세팅.. GET을 통해 서버로부터 데이터를 가져오는 것을 요구하고,
            footerpath는 URL, true는 모르겠습니다 ㅜ*/
            link.send(); //.open으로 세팅한 요구 사항을 실제 서버로 보낸다.
            return 0; //if문의 목적은 HTTP요청 실행에 있어 반환값은 없다.
        }
    }
}
