import React, { useState } from "react";
import styled from "styled-components";
import { Link, Outlet, Route, Routes, useParams, useSearchParams } from "react-router-dom";
import Catname from "./Catname";

function Other({ cats }) {
  const Catboard = styled.div`
    width: 450px;
    height: 35px;
    display: flex;
    justify-content: center;
  `;

  const Catnames = styled.div`
    width: 150px;
    height: 30px;
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
        {isCheck && 
            cats.map((cat) => (
            <Catboard>
              <Catnames>
              {/* <Routes> */}
                {/* <Route path={cat.id} element={<Catname cat={cat}/>}/> */}
                {/* Catname 모듈: DB 정보 불러와서 종 이름 나열하는 용도 */}
                <Catname cat={cat}/>
              {/* </Routes> */}
              </Catnames>
                
                {/* <div>
                  <li>
                    <Link to="about">랙돌</Link>
                  </li>
                  <li>
                    <Link to="about">스코티시폴드</Link>
                  </li>
                  <li>
                    <Link to="about">샴</Link>
                  </li>
                  <li>
                    <Link to="about">페르시안</Link>
                  </li>
                  <li>
                    <Link to="about">아비시니안</Link>
                  </li>
                  <li>
                    <Link to="about">아메리칸쇼트헤어</Link>
                  </li>
                  <li>
                    <Link to="about">브리티시쇼트헤어</Link>
                  </li>
                  <li>
                    <Link to="about">벵갈</Link>
                  </li>
                  <li>
                    <Link to="about">터키시앙고라</Link>
                  </li>
                  <li>
                    <Link to="about">귀여운</Link>
                  </li>
                  <li>
                    <Link to="about">고양이</Link>
                  </li>
                </div>
              </Catnames> */}
            </Catboard>)
            )
}</div>
  )
}


export default Other;
