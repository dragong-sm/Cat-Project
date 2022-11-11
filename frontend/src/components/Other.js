import React, { useState } from "react";
import styled from "styled-components";
import {
  Link,
  Outlet,
  Route,
  Routes,
  useParams,
  useSearchParams,
} from "react-router-dom";

function Other({ cats }) {
  const Catboard = styled.div`
    width: 450px;
    height: 35px;
    display: flex;
    justify-content: center;
  `;

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

  // 토글버튼
  const [isCheck, setCheck] = useState(false);

  // 데이터 가져와 비구조화 할당하기
  // data, cats, setcats 모두 App.js에 있음.
  // const [ id, species ] = cats;

  return (
    <div>
      <button
        onClick={() => {
          setCheck((e) => !e);
        }}
      >
        {isCheck ? "▼" : "▼"}
      </button>
      <h3>다른 종류 검색하기</h3>

      {/* 고양이 품종별 링크 리스트 */}
      {isCheck && (
        <Catboard>
          <Catnames>
            <div>
              <li>
                <Link to="about/6">랙돌</Link>
              </li>
              <li>
                <Link to="about/7">스코티시폴드</Link>
              </li>
              <li>
                <Link to="about/8">샴</Link>
              </li>
              <li>
                <Link to="about/9">페르시안</Link>
              </li>
              <li>
                <Link to="about/10">아비시니안</Link>
              </li>
              <li>
                <Link to="about/11">아메리칸쇼트헤어</Link>
              </li>
              <li>
                <Link to="about/12">브리티시쇼트헤어</Link>
              </li>
              <li>
                <Link to="about/13">벵갈</Link>
              </li>
              <li>
                <Link to="about/14">터키시앙고라</Link>
              </li>
              <li>
                <Link to="about/15">귀여운</Link>
              </li>
              <li>
                <Link to="about/16">고양이</Link>
              </li>
            </div>
          </Catnames>
        </Catboard>
      )}
    </div>
  );
}

export default Other;
