import React from "react";
import styled from "styled-components";

export const Wrapper = styled.section`
  height: 950px;
  width: 100%;
  padding: 0.5px;
  background: #dff6ff;
`;

export const Article = styled.h1`
  height: 5%;
  padding: 10px;
  margin: 10px;
  font-size: 1.5em;
  border: 5px solid gray;
  border-style: none none double none;
  background: yellow;
`;

export const PreviousPage = styled.section`
  height: 3%;
  margin: 10px;
  padding: 10px;
  text-align: right;
  background: violet;
`;

export const Main = styled.section`
  height: 50%;
  padding: 10px;
  margin: 10px;
  background: blue;
`;

export const More = styled.section`
  height: 20%;
  padding: 10px;
  margin: 10px;
  background: red;
`;

export const MainImage = styled.img`
  height: 90%;
  width: 40%;
  margin-top: 1%;
  margin-left: 10%;
  float: left;
  border: 10px solid skyblue;
  border-style: inset;
  border-radius: 30px;
`;

export const Contents = styled.div`
  height: 90%;
  width: 30%;
  padding: 10px;
  margin-top: 1%;
  margin-right: 10%;
  float: right;
  font-size: 15px;
  text-align: left;
  //   background: green;
`;

export const MoreImage = styled.img`
  width: 25%;
  height: 80%;
  margin: 10px;
  padding: 10px;
  // background: blue;
`;
