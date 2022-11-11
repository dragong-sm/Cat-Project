import React from "react";
import styled from "styled-components";

export const Wrapper = styled.section`
  height: 100%;
  width: 100%;
  padding: 0.5px;
  background: #dff6ff;
  display: flex;
  flex-wrap: wrap;
`;

export const Article = styled.h1`
  height: 4%;
  padding: 10px;
  margin: 10px;
  font-size: 1.5em;
  border: 5px solid gray;
  border-style: none none double none;
  background: yellow;
`;

export const GoHomePage = styled.section`
  height: 2%;
  margin: 10px;
  padding: 10px;
  text-align: right;
  background: violet;
`;

export const Main = styled.section`
  height: 40%;
  padding: 10px;
  margin: 10px;
  display: flex;
  flex-wrap: nowrap;
  flex-direction: row;
  jutify-content: space-between;
  align-items: center;
  background: violet;
`;

export const More = styled.section`
  height: 20%;
  padding: 10px;
  margin: 10px;
  display: flex;
  jutify-content: center;
  overflow: auto;
  white-space: wrap;
  background: violet;
`;

export const MainImage = styled.img`
  height: 90%;
  width: 60%;
  margin-left: 5%;
  float: left;
  border: 10px solid skyblue;
  border-style: inset;
  border-radius: 30px;
`;

export const Contents = styled.div`
  height: 90%;
  padding: 10px;
  margin-left: 5%;
  margin-right: 5%;
  float: right;
  font-size: 15px;
  text-align: left;
  overflow: auto;
  // text-overflow: ellipsis;
`;

export const MoreImage = styled.img`
  width: 25%;
  height: 80%;
  margin: 10px;
  padding: 10px;
`;

export const Button = styled.button`
  background: #bccef8;
  font-size: 13px;
  margin: 10px;
  padding: 0.5em 1em;
  border: 2px solid;
  border-radius: 3px;
  border-color: #bccef8;
`;
