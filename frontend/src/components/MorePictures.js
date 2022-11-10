import React from "react";
import styled from "styled-components";

function MorePictures({ photos }) {
  const Button = styled.button`
    background: #bccef8;
    font-size: 1em;
    margin: 1em;
    padding: 0.5em 1em;
    border: 2px solid palevioletred;
    border-radius: 3px;
    border-color: #bccef8;
  `;

  // imgSrc : 총 세개의 url 더 불러오기 ( 배열이라면 > index 1 2 3)
  // db에 고양이 한마리당, photo url 4개 필요 !

  // moreCatSrc : naver의 해당 고양이 이미지 검색시 보이는 화면 url
  // - db에 추가 or URL패턴 !
  const moreCatSrc = `https://search.naver.com/search.naver?where=image&sm=tab_jum&query=노르웨이숲고양이`;

  return (
    <div>
      {/* <img src={photos[1]} width="150px" height="130px"></img>
      &nbsp;&nbsp;
      <img src={photos[2]} width="150px" height="130px"></img>
      &nbsp;&nbsp;
      <img src={photos[3]} width="150px" height="130px"></img>
      <br></br> */}
      <Button>
        <a href={moreCatSrc} target="_blank">
          Do you want More Pictures ?
        </a>
      </Button>
    </div>
  );
}

export default MorePictures;