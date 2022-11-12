import Other from "../components/Other";
import Pictures from "../components/Pictures";
import React, { useState } from "react";
import { Article } from "../styles/Style";
import { HomeWrapper, HomeMain } from "../styles/homestyles";

export function Home({ cats }) {
  const [UpdateToggle, setUpdateToggle] = useState(false);
  const onUpdateToggle = () => {
    setUpdateToggle(!UpdateToggle);
  };

  return (
    <div>
      <HomeWrapper>
        <Article>Cat 검색</Article>
        <HomeMain>
          <Pictures />
        </HomeMain>
        <Other />
      </HomeWrapper>
    </div>
  );
}
