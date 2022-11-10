import React, { useState } from "react";
import styled from "styled-components";
import { More, MoreBtn, MoreImage } from "../styles/Style";

function MorePictures({ cat }) {
  // moreCatSrc : naver의 해당 고양이 이미지 검색시 보이는 화면 url
  // - db에 추가 or URL패턴 !
  // console.log(cat.species);

  // console.log(catSpecies);
  // console.log(searchURL + catSpecies);

  return (
    <div>
      {/* {pictures.map((picture) => ( */}
      {/* <div key={pictures.id}> */}

      <div>
        <img src="" width="150px" height="130px"></img>
      </div>
      <div>
        <img src="" width="150px" height="130px"></img>
      </div>
      <div>
        <img src="" wwidth="150px" height="130px"></img>
      </div>
      <div>
        <img src="" width="150px" height="130px"></img>
      </div>
      <div>
        <img src="" width="150px" height="130px"></img>
      </div>
      {/* </div> */}
      {/* ))} */}
    </div>
  );
}

export default MorePictures;
