import React, { useState } from "react";
import styled from "styled-components";

function Other({ onUpdateToggle }) {
  const Catboard = styled.div`
    width: 450px;
    height: 500px;
    display: flex;
    justify-content: center;
  `

  const Catnames = styled.div`
    width: 150px;
    height: 300px;
    text-align: left;
    list-style-type: none;
    margin-left: 20px;
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
    align-items: flex-start;
    align-content: center;
  `;

  const [isCheck, setCheck] = useState(false);

  return (
    <div>
      <button
        onClick={() => {
          setCheck((e) => !e);
        }}
      >
        {isCheck ? "▼" : "▶"}
      </button>
        <h3>
        다른 종류 검색하기
      </h3>

      {/* 고양이 품종 링크 리스트 넣기 */}
      {isCheck && (<Catboard>
      <Catnames>
      <div>
        <li><a href="#">랙돌</a></li>
        <li><a href="#">스코티시폴드</a></li>
        <li><a href="#">샴</a></li>
        <li><a href="#">페르시안</a></li>
        <li><a href="#">아비시니안</a></li>
        <li><a href="#">아메리칸쇼트헤어</a></li>
        <li><a href="#">브리티시쇼트헤어</a></li>
        <li><a href="#">벵갈</a></li>
        <li><a href="#">터키시앙고라</a></li>
        <li><a href="#">귀여운</a></li>
        <li><a href="#">고양이</a></li>
      </div>
      </Catnames>
      </Catboard>)}
    </div>
  );
}

export default Other;
