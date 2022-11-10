import Detail from "../components/Detail";
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
import CatContents from "../components/CatContents";

// 상세설명페이지
export function About({ cats }) {

  return (
    <div>
      {cats.map((cat) => (
        <div key={cat.species}>
          <Wrapper>
            <Article>
              <b> " {cat.species} " </b>
            </Article>
            <PreviousPage>
              <button>
                <a href="" target="_blank">
                  Move to previous page
                </a>
              </button>
            </PreviousPage>
            <Main>
              <MainImage src={cat.photoURL[0]}></MainImage>
              <Contents>
                <CatContents cat={cat} />
              </Contents>
            </Main>
            <More>
              <MorePictures photos={cat.photoURL} />
            </More>
          </Wrapper>
        </div>
      ))}
    </div>
  );
}
