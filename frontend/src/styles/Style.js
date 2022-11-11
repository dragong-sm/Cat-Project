import React from "react";
import styled from "styled-components";

// 전체화면
export const Wrapper = styled.section`
  display: flex;
  flex-flow: column nowrap;
  flex: 1 0 auto;
  height: 100%;
  box-sizing: border-box;
  background: #dff6ff;
  padding: 10px;
`;

//  제목
export const Article = styled.h2`
  display: flex;
  flex: 0 1 auto;
  padding: 10px; // 요소 내부 너비
  justify-content: center; // 수평 위치 설정
  align-items: center; // 수직 위치 설정
  border-style: none none double none;
  // background-color: DodgerBlue;
  line-height: 40px;
  // color: gray; // 글씨색
`;

// homepage 버튼영역
export const GoHomePage = styled.section`
  display: flex;
  flex: 0 1 auto;
  justify-content: right;
  align-items: center;
  margin-left: auto;
  // background: violet;
`;

//  main 영역 (고양이 사진 +  contents )
export const Main = styled.section`
  height: 500px;
  display: flex;
  flex: 0 1 auto;
  padding: 30px;
  flex-wrap: nowrap;
  align-items: center;
  justify-content: space-around;
  // background: blue;
`;

// 사진 더보기 영역
export const More = styled.section`
  display: flex;
  flex: 0 1 auto;
  height: 30%;
  flex-wrap: nowrap;
  align-items: center;
  justify-content: space-around;
  background: violet;
  margin-top: auto;
`;

// main 이미지
export const MainImage = styled.img`
  display: flex;
  height: 95%;
  width: 40%;
  float: left;
  border: 10px solid skyblue;
  border-style: inset;
  border-radius: 30px;
`;

// main contents
export const Contents = styled.div`
  display: flex;
  height: 95%;
  width: 40%;
  // background: yellow;
  text-overflow: ellipsis;
  overflow: auto;
  text-align: left;
`;

// more image
export const MoreImage = styled.img``;

// 버튼
export const Button = styled.button`
  background: none;
  font-size: 13px;
  margin: 10px;
  padding: 0.5em 1em;
  border: 2px solid;
  border-radius: 3px;
  border-color: #dff6ff;
`;
