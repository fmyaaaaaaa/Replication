const path = require('path');
const webpack = require('webpack');
const { VueLoaderPlugin } = require("vue-loader");

module.exports = {
    entry: {
        index: './src/main/resources/static/public/input',
        vendor: ['vue', 'vuex']
    },
    output: {
        path: path.resolve(__dirname, 'src', 'main', 'resources', 'static', 'js'),
        publicPath: '/js/',
        filename: '[name].js'
    },
    module: {
        rules: [
            {
                test: /\.vue$/,
                loader: 'vue-loader',
            },
            {
                test: /\.(css|sass|scss)$/,
                use: [
                    'vue-style-loader',
                    'css-loader',
                    'sass-loader'
                ]
            },
            {
                test: /\.js$/,
                loader: 'babel-loader',
                options: {
                    presets: [
                        '@babel/preset-env',
                    ]
                }
            },
            {
                test: /\.(jpg|png)$/,
                loaders: 'url-loader'
            },
        ]
    },
    devServer: {
        contentBase: path.join(__dirname, "./src/main/resources/")
    },
    optimization: {
        splitChunks: {
            name: 'vendor',
            chunks: 'initial',
        }
    },
    plugins: [new VueLoaderPlugin()]
}
