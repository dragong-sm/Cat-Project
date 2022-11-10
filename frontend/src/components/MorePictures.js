import React from "react";
import styled from "styled-components";

function MorePictures({ pictures }) {
  const Button = styled.button`
    background: #bccef8;
    font-size: 1em;
    margin: 1em;
    padding: 0.5em 1em;
    border: 2px solid palevioletred;
    border-radius: 3px;
    border-color: #bccef8;
  `;

  // moreCatSrc : naver의 해당 고양이 이미지 검색시 보이는 화면 url
  // - db에 추가 or URL패턴 !
  const moreCatSrc = `https://search.naver.com/search.naver?where=image&sm=tab_jum&query=노르웨이숲고양이`;

  return (
    <div>
      {pictures.map((picture) => (
        <div key={pictures.id}>
          <img src={[picture.photoURL[1]]} width="150px" height="130px"></img>
          &nbsp;&nbsp;
          <img src={[picture.photoURL[2]]} width="150px" height="130px"></img>
          &nbsp;&nbsp;
          <img src={[picture.photoURL[3]]} width="150px" height="130px"></img>
          &nbsp;&nbsp;
          <img src={[picture.photoURL[4]]} width="150px" height="130px"></img>
          &nbsp;&nbsp;
          <img src={[picture.photoURL[5]]} width="150px" height="130px"></img>
          <br></br>
          <Button>
            <a href={moreCatSrc} target="_blank">
              Do you want More Pictures ?
            </a>
          </Button>
        </div>
      ))}
    </div>
  );
}

export default MorePictures;
