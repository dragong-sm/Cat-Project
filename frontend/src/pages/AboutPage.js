import React, { useEffect } from "react";
import CatContents from "../components/CatContents";
import GoHomeBtn from "../components/GoHomeBtn";
import MainPicture from "../components/MainPicture";
import MoreBtn from "../components/MoreBtn";
import MorePictures from "../components/MorePictures";
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
function AboutPage({ cats }) {
  // console.log(cats);
  return (
    <div>
      <Wrapper>
        {cats.map((cat) => (
          <div key={cat.id}>
            <Article>
              <b> " {cat.species} " </b>
            </Article>
            <GoHomePage>
              <GoHomeBtn />
            </GoHomePage>
            <Main>
              <MainImage src="https://search.pstatic.net/common?type=f&size=518x522&quality=95&direct=true&src=http%3A%2F%2Fshop1.phinf.naver.net%2F20200309_166%2F1583725050886CTWAw_JPEG%2F19860647745281435_-647047757.jpeg" />
              <Contents>
                <CatContents cat={cat} />
              </Contents>
            </Main>
            <More>
              <MorePictures cat={cat} />
            </More>
            <MoreBtn cat={cat} />
          </div>
        ))}
      </Wrapper>
    </div>
  );
}

export default AboutPage;
