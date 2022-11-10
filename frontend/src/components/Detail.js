import React, { useState } from "react";
import MorePictures from "../components/MorePictures";
import styled from "styled-components";
import {
  Wrapper,
  Main,
  More,
  MainImage,
  Contents,
  MoreImage,
  Article,
} from "../styles/Style";

function Detail({ cats }) {
  //console.log(cats);

  return (
    <div>
      {cats.map((cat) => (
        <div key={cat.species}>
          <Wrapper>
            <Article>
              <b> " {cat.species} " </b>
              <hr></hr>
            </Article>
            <Main>
              <MainImage src={cat.photoURL[0]} alt={cat.species}></MainImage>
              <Contents>
                &nbsp;&nbsp;
                <li>성격 : {cat.personality}</li>
                &nbsp;&nbsp;
                <li>체중 : {cat.weight}</li>
                &nbsp;&nbsp;
                <li>털 : {cat.hair}</li>
              </Contents>
            </Main>
            <More>
              <MoreImage src={cat.photoURL[1]} alt={cat.species}></MoreImage>
              <MoreImage src={cat.photoURL[2]} alt={cat.species}></MoreImage>
              <MoreImage src={cat.photoURL[3]} alt={cat.species}></MoreImage>
              <MorePictures />
            </More>
          </Wrapper>
        </div>
      ))}
    </div>
  );
}

export default Detail;
