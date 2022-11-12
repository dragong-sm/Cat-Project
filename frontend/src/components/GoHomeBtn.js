import React from "react";
import { Button } from "../styles/Style";

function GoHomeBtn() {
  return (
    <Button>
      <a href="http://localhost:3000/" target="_self">
        ⌛ Move to Homepage
      </a>
    </Button>
  );
}

export default GoHomeBtn;
