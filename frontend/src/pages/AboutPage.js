import React, { useEffect, useState } from "react";
import { useParams, useSearchParams } from "react-router-dom";
import CatContents from "../components/CatContents";
import GoHomeBtn from "../components/GoHomeBtn";
import MoreBtn from "../components/MoreBtn";
import MorePictures from "../components/MorePictures";
import { axiosCatPictures, axiosCatData } from "../api/getCats";
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
  // 데이터 db로 불러오기 !
  const [cats, setCats] = useState([
    {
      id: 0,
      species: "",
      description: "",
      personality: "",
      weight: "",
      hair: "",
    },
  ]);

  const { catId } = useParams();
  // console.log(catId); // about/:catId 에서 파라미터 catId(0,1,2,...)확인

  useEffect(() => {
    // axios 사용
    // const data = axiosCatData();

    const requestParams = { command: "GetCatInfo", catId: 1 };

    const responseData = axios
      .get("http://localhost:8080/cat/picture", {
        params: requestParams,
      })
      .then((response) => setCats(response.data))
      .catch(function (error) {
        console.log(error);
      });

    //   console.log(responseData);
    //   console.log(responseData.data);
    // const data = responseData.data;
    // data.then((data) => setCats(data));
  }, []);

  // catProfile : 고양이 객체
  // const catProfile = cats[catId];
  // console.log(catProfile);

  return (
    <div>
      {/* {catProfile.id} */}
      <Wrapper>
        <Article>
          <b> " {cats.species} " </b>{" "}
        </Article>
        <GoHomePage>
          <GoHomeBtn />
        </GoHomePage>
        <Main>
          <MainImage src="https://search.pstatic.net/common?type=f&size=518x522&quality=95&direct=true&src=http%3A%2F%2Fshop1.phinf.naver.net%2F20200309_166%2F1583725050886CTWAw_JPEG%2F19860647745281435_-647047757.jpeg" />
          <Contents>
            <CatContents catProfile={cats} />
          </Contents>
        </Main>
        <More>{/* <MorePictures catProfile={catProfile} /> */}</More>
        {/* <MoreBtn catProfile={catProfile} /> */}
      </Wrapper>
    </div>
  );
}

export default AboutPage;
