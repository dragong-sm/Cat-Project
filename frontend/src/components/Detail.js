import React, { useState } from "react";
import MorePictures from "../components/MorePictures";
import styled from "styled-components";

function Detail({ cats }) {
  //console.log(cats);
  const Wrapper = styled.section`
    padding: 1em;
    background: #dff6ff;
  `;

  const NameSection = styled.h1`
    font-size: 1.5em;
  `;

  const MainSection = styled.section`
    height: 450px;
    padding: 0px;
    margin: 10px;
    // background: blue;
  `;

  const MoreSection = styled.section`
    height: 200px;
    padding: 10px;
    margin: 10px;
    // background: red;
  `;

  const MainImage = styled.img`
    width: 50%;
    height: 90%;
    float: left;
    padding: 10px;
    margin: 10px;
    // background: green;
  `;

  const Contents = styled.div`
    width: 40%;
    height: 95%;
    float: right;
    padding: 10px;
    margin: 10px;
    font-size: 18px;
    text-align: left;
  `;

  const MoreImage = styled.img`
    width: 18%;
    height: 65%;
    margin: 10px;
  `;

  return (
    <div>
      {cats.map((cat) => (
        <div key={cat.species}>
          <Wrapper>
            <NameSection>
              <b> " {cat.species} " </b>
              <hr></hr>
            </NameSection>
            <MainSection>
              <MainImage src={cat.photoURL[0]} alt={cat.species}></MainImage>
              <Contents>
                &nbsp;&nbsp;
                <li>성격 : {cat.personality}</li>
                &nbsp;&nbsp;
                <li>체중 : {cat.weight}</li>
                &nbsp;&nbsp;
                <li>털 : {cat.hair}</li>
              </Contents>
            </MainSection>
            <MoreSection>
              <MoreImage src={cat.photoURL[1]} alt={cat.species}></MoreImage>
              <MoreImage src={cat.photoURL[2]} alt={cat.species}></MoreImage>
              <MoreImage src={cat.photoURL[3]} alt={cat.species}></MoreImage>
              <MorePictures />
            </MoreSection>
          </Wrapper>
        </div>
      ))}
    </div>
  );
}

export default Detail;
