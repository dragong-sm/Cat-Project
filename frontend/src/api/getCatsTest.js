import axios from "axios";
import React from "react";

function gatCatsTest() {
  const getData = {
    command: "getCatInfo",
    catId: 1,
  };

  const config = {
    url: "http://localhost:8080/catproject/cat",
    method: "post",
    data: getData,
    headers: {
      "Content-Type": "test/html",
    },
  };

  axios(config)
    .then(function (response) {
      console.log(response);
    })
    .catch(function (error) {
      console.log(error);
    });

  return response.data;
}

export default getCatsTest;
