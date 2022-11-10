import MorePictures from "../components/MorePictures";
import React, { useEffect } from "react";
import { useState } from "react";
import { getData, axiosData } from "../api/getCats";
import data from "../db/mock.json";
import { Link, Outlet, useParams, useSearchParams } from "react-router-dom";
import {
  Wrapper,
  Main,
  More,
  MainImage,
  Contents,
  Article,
  PreviousPage,
} from "../styles/Style";
import { PreviousBtn, Species } from "../components/AboutHeader";
import { CatContents } from "../components/AboutMain";

// 상세설명페이지
function AboutPage({ cat, pictures }) {
  console.log(pictures.photoURL);
  return (
    <div>
      <Wrapper>
        <Article>
          <Species cat={cat} />
          {/* 맨 위에 품종 출력 */}
        </Article>
        <PreviousPage>
          <PreviousBtn />
          {/* 이전 페이지로 돌아가기 */}
        </PreviousPage>
        <Main>
          {pictures.map((picture) => (
            <div key={pictures.id}>
              <MainImage src={picture.photoURL[0]}></MainImage>
            </div>
          ))}
          <Contents>
            <CatContents cat={cat} />
          </Contents>
        </Main>
        <More>
          <MorePictures pictures={pictures} />
        </More>
      </Wrapper>
    </div>
  );
}

export default AboutPage;
