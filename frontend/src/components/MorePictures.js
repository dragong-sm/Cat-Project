import React, { useState } from "react";
import styled from "styled-components";
import { More, MoreBtn, MoreImage, MoreSection } from "../styles/Style";

function MorePictures({ catUrl, species }) {
  // console.log(cat.id);

  return (
    <div>
      <MoreSection>
        <MoreImage src={catUrl[1]} alt={species}></MoreImage>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <MoreImage src={catUrl[2]} alt={species}></MoreImage>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <MoreImage src={catUrl[3]} alt={species}></MoreImage>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <MoreImage src={catUrl[4]} alt={species}></MoreImage>
      </MoreSection>
    </div>
  );
}

export default MorePictures;
