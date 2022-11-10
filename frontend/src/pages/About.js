import Detail from "../components/Detail";
import MorePictures from "../components/MorePictures";
import React, { useEffect } from "react";
import { useState } from "react";
import { getData } from "../api/getCats";
import data from "../db/mock.json";

// 상세설명페이지
export function About() {
  // 데이터는 db로 불러오기 !
  useEffect(() => {
    const data = getData();
    setCats(data);
  }, []);

  const [cats, setCats] = useState(data);

  return (
    <div>
      {/* <h1> About test </h1> */}
      <Detail cats={cats} />
      {/* 1. 각 고양이의 데이터를 불러옴 (Detail) */}
      {/* 2. Detail 안에서 고양이상세설명 + MorePictures 버튼 */}
      {/* 3. MorePictures 버튼을 클릭하면 더많은 고양이사진 불러옴 */}
    </div>
  );
}
