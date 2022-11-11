import React, { useEffect, useState } from "react";
import { useParams, useSearchParams } from "react-router-dom";
import CatContents from "../components/CatContents";
import GoHomeBtn from "../components/GoHomeBtn";
import MoreBtn from "../components/MoreBtn";
import MorePictures from "../components/MorePictures";
import axios from "axios";
import {
  Wrapper,
  Main,
  More,
  MainImage,
  Contents,
  Article,
  GoHomePage,
} from "../styles/Style";

// 상세설명페이지
function AboutPage() {
  // URL 파라미터를 이용해서 고양이 변경
  const { catId } = useParams();
  console.log(catId); // about/:catId 에서 파라미터 catId(0,1,2,...)확인

  // 고양이 데이터
  const [cats, setCats] = useState([
    {
      id: 0,
      description: "",
      hairType: "",
      origin: "",
      size: "",
      species: "",
      temper: "",
    },
  ]);

  // axios 사용해서 서버로부터 데이터 불러옴 : 고양이 정보
  useEffect(() => {
    const requestParams = { command: "GetCatInfo", catId: catId };

    // promise 객체는 내부에서 풀어주어야 함
    axios
      .get("http://localhost:8080/cat/cat", {
        params: requestParams,
      })
      .then((response) => setCats(response.data))
      .catch(function (error) {
        console.log(error);
      });
  }, []);

  console.log(cats); //확인

  // 그림 URL
  const [catUrl, setCatUrl] = useState(null);

  useEffect(() => {
    const requestParams = { command: "getPictures", catId: catId };

    axios
      .get("http://localhost:8080/cat/picture", {
        params: requestParams,
      })
      .then((response) => setCatUrl(response.data))
      .catch(function (error) {
        console.log(error);
      });
  }, []);

  // console.log(catUrl); // 확인

  return (
    <div>
      <Wrapper>
        <Article>" {cats.species} "</Article>
        <GoHomePage>
          <GoHomeBtn />
        </GoHomePage>
        <Main>
          <MainImage src="https://search.pstatic.net/common?type=f&size=518x522&quality=95&direct=true&src=http%3A%2F%2Fshop1.phinf.naver.net%2F20200309_166%2F1583725050886CTWAw_JPEG%2F19860647745281435_-647047757.jpeg" />
          <Contents>
            <CatContents cats={cats} />
          </Contents>
        </Main>
        <More>
          <MorePictures cats={cats} />
          <MoreBtn cats={cats} />
        </More>
      </Wrapper>
      {/* {catUrl} */}
    </div>
  );
}

export default AboutPage;
