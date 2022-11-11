import React from "react";
import styled from "styled-components";
import { Button } from "../styles/Style";

function GoHomeBtn() {
  return (
    <Button>
      <a href="http://localhost:3000/" target="_blank">
        ⌛ Move to Homepage ?
      </a>
    </Button>
  );
}

export default GoHomeBtn;
