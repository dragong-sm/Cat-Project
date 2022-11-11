import React, { useState, useEffect } from "react";
import { MainImage } from "../styles/Style";
import { axiosCatPictures } from "../api/getCats";

// 수정필요 !!!!!!!!!!!!1
function MainPicture({ cat }) {
  const [pictures, setPictures] = useState([]);
  useEffect(() => {
    // axios 사용
    const data = axiosCatPictures();
    data.then((data) => setPictures(data));
  }, []);

  //   console.log(pictures);

  // catId == picId 인 데이터를 불러옴 !
  // 해당 pic 데이터에서 url 값만 빼냄

  return (
    <div>
      <MainImage src="https://search.pstatic.net/common?type=f&size=518x522&quality=95&direct=true&src=http%3A%2F%2Fshop1.phinf.naver.net%2F20200309_166%2F1583725050886CTWAw_JPEG%2F19860647745281435_-647047757.jpeg"></MainImage>
    </div>
  );
}

export default MainPicture;
