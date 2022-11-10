import React, { useEffect } from "react";
import "./App.css";
import { Home } from "./pages/Home";
import { useState } from "react";
import { Route, Routes } from "react-router-dom";
import { axiosCatPictures, axiosCatData } from "./api/getCats";
import data from "./db/mock.json";
import AboutPage from "./pages/AboutPage";

function App() {
  // 데이터 db로 불러오기 !
  const [cat, setCat] = useState([]);
  useEffect(() => {
    // axios 사용
    const data = axiosCatData();
    data.then((data) => setCat(data));
  }, []);

  const [pictures, setPictures] = useState([]);
  useEffect(() => {
    // axios 사용
    const data = axiosCatPictures();
    data.then((data) => setPictures(data));
  }, []);

  // console.log(pictures);

  // 페이지구성
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Home />} />
        <Route
          path="about"
          element={<AboutPage cat={cat} pictures={pictures} />}
        />
      </Routes>
    </div>
  );
}

export default App;
