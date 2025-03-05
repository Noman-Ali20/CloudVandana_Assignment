let images = [
    "img1.jpg",
    "img2.jpg",
    "img3.jpg",
   "img4.jpeg"
];

let currentIndex = 0;
let slider = document.getElementById("slider");

function showImage(index) {
    slider.src = images[index];
}

// Show the first image on load
window.onload = () => showImage(currentIndex);

function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    showImage(currentIndex);
}

function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage(currentIndex);
}
