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
import Catname from "./Catname";
import { Button } from "../styles/Style";

function Other() {
  const Catboard = styled.div`
    display: flex;
    width: 450px;
    height: 100%;
    display: flex;
    justify-content: center;
    // background: yellow;
  `;

  const Catnames = styled.div`
    width: 150px;
    height: 300px;
    text-align: center;
    list-style-type: none;
    margin-left: 20px;
    display: flex;
    flex-wrap: wrap;
    felx-direction: column;
    justify-content: space-between;
    align-items: flex-start;
    align-content: center;
    // background: red;
  `;

  // 토글버튼
  const [isCheck, setCheck] = useState(false);

  // 데이터 가져와 비구조화 할당하기
  // data, cats, setcats 모두 App.js에 있음.
  // const [ id, species ] = cats;

  return (
    <div>
      <Button
        onClick={() => {
          setCheck((e) => !e);
        }}
      >
        {/* <button
          onClick={() => {
            setCheck((e) => !e);
          }}
        > */}
        {isCheck ? "Click the Species" : "Search Other Species ? "}
        {/* </button> */}
      </Button>

      {/* 고양이 품종별 링크 리스트 */}
      {isCheck && (
        <Catboard>
          <Catnames>
            <div>
              <i>
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
              </i>
            </div>
          </Catnames>
        </Catboard>
      )}
    </div>
  );
}

export default Other;
